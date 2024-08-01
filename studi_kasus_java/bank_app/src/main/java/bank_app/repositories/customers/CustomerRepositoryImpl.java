package bank_app.repositories.customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.List;

import bank_app.entities.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {

  private DataSource dataSource;

  public CustomerRepositoryImpl(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  Connection connection() throws SQLException {
    return dataSource.getConnection();
  }

  // Mengecek apakah akun dengan id tersedia
  boolean isExist(String accountNumber) {
    String sql = "SELECT account_number FROM bank_data_nasabah WHERE account_number = ?";

    try (Connection connection = connection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, accountNumber);

      ResultSet resultSet = statement.executeQuery();

      if (resultSet.next()) {
        return true;
      } else {
        return false;
      }
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  // Mengamnil data customer
  @Override
  public Customer customer(String accountNumber) {
    Customer data = new Customer();

    if (isExist(accountNumber)) {
      String sql = "SELECT * FROM bank_data_nasabah WHERE account_number = ?";
      try (Connection connection = connection();
          PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setString(1, accountNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
          data.setAccountNumber(resultSet.getString("account_number"));
          data.setName(resultSet.getString("name"));
          data.setPhoneNumber(resultSet.getString("phone_number"));
          data.setDateJoin(resultSet.getDate("date_join"));
          data.setAccountType(resultSet.getString("account_type"));
        }
      } catch (SQLException exception) {
        System.out.println(exception.getMessage());
      }
    } else {
      data.setName("Not Found!");
    }

    return data;

  }

  // Mengedit data customer
  @Override
  public void editCustomer(String accountNumber, Customer customer) {
    String sql = "UPDATE bank_data_nasabah SET name = ?, phone_number = ? WHERE account_number = ?";

    try (Connection connection = connection(); PreparedStatement statement = connection.prepareStatement(sql)) {

      statement.setString(1, customer.getName());
      statement.setString(2, customer.getPhoneNumber());
      statement.setString(3, accountNumber);

      statement.executeUpdate();

    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }

  }

  // Mengambil seluruh customer yang ada
  @Override
  public Customer[] getAllcustomer() {
    String sql = "SELECT * FROM `bank_data_nasabah`";
    List<Customer> customers = new ArrayList<>();

    try (Connection connection = connection(); ResultSet resultSet = connection.createStatement().executeQuery(sql)) {

      while (resultSet.next()) {
        Customer customer = new Customer(
            resultSet.getString("account_number"),
            resultSet.getString("name"),
            resultSet.getString("phone_number"),
            resultSet.getDate("date_join"),
            resultSet.getString("account_type"));

        customers.add(customer);
      }
      return customers.toArray(new Customer[] {});
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  // Menambahkan customer baru
  @Override
  public void registerCustomer(Customer customer) {
    String sql = "INSERT INTO `bank_data_nasabah`(`account_number`, `name`, `phone_number`, `account_type`) VALUES (?, ?, ?, ?)";
    try (Connection connection = connection(); PreparedStatement statement = connection.prepareStatement(sql)) {

      statement.setString(1, customer.getAccountNumber());
      statement.setString(2, customer.getName());
      statement.setString(3, customer.getPhoneNumber());
      statement.setString(4, customer.getAccountType());

      statement.executeUpdate();

    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  // Menghapus satu customer
  @Override
  public void removeCustomer(String accountNumber) {
    String sql = "DELETE FROM `bank_data_nasabah` WHERE account_number = ?";

    try (Connection connection = connection(); PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, accountNumber);
      statement.executeUpdate();
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }
}
