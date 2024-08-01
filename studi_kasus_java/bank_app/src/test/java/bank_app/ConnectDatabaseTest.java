package bank_app;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import bank_app.utils.Database;

public class ConnectDatabaseTest {
  @Test
  public void test() throws SQLException {
    Connection connection = Database.getDataSource().getConnection();
    PreparedStatement statement = connection
        .prepareStatement("INSERT INTO bank_data_nasabah(id, name, phone_number, date_join) VALUES(?,?,?,?)");

    statement.setInt(1, 100);
    statement.setString(2, "Topan Sidiq");
    statement.setString(3, "082288404233");
    statement.setDate(4, new Date(System.currentTimeMillis()));
    statement.executeUpdate();
    System.out.println(statement);
  }
}
