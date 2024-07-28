package topan_databases;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mysql.cj.jdbc.Driver;

public class RegisterDriverTest {
  @Test
  public void testDrive() {
    try {
      Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
      DriverManager.registerDriver(mysqlDriver);

      System.out.println("[Driver register success!]");
    } catch (SQLException exception) {
      System.out.println("[Driver not register!]");
      Assertions.fail(exception);
    }
  }
}
