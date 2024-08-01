package bank_app.repositories;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;

import bank_app.entities.AccountType;
import bank_app.entities.Customer;
import bank_app.repositories.customers.CustomerRepositoryImpl;
import bank_app.utils.Database;

public class CustomerTest {

  private DataSource dataSource = Database.getDataSource();
  private CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl(dataSource);

  @Test
  public void testGetCustomer() {
    Customer customer = customerRepository.customer("90909090");
    System.out.println(customer.getName());
  }

  @Test
  public void testRemoveCustomer() {
    customerRepository.removeCustomer("90909090");
  }

  @Test
  public void testRegisterCustomer() {

    int countryCode = 62;
    int bankCode = 113;
    int placeCode = 1290;
    int number = 101;

    String accountNumber = String.valueOf(countryCode) + String.valueOf(bankCode) + String.valueOf(placeCode)
        + String.valueOf(placeCode) + String.valueOf(number);
    String name = "Salsabila Agustin";
    String phoneNumber = "082388407308";
    String accountType = AccountType.REGULAR.toString();

    customerRepository.registerCustomer(new Customer(
        accountNumber, name, phoneNumber, accountType));

    System.out.println(customerRepository.customer(accountNumber).getName());
  }

}
