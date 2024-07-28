package topan_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mysql.cj.jdbc.Driver;

public class ConnectionTest {

  @BeforeAll
  static void beforeAll() {
    try {
      Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
      DriverManager.registerDriver(mysqlDriver);
      System.out.println("[Driver register success]");
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  @Test
  public void testConnection() {
    String jdbcURL = "jdbc:mysql://localhost/belajar_java_database";
    String username = "root";
    String password = "";

    try {
      Connection connection = DriverManager.getConnection(jdbcURL, username, password);
      System.out.println("[Success connect to database]");

      System.out.println("[Program finished]");
      connection.close();

      if (connection.isClosed()) {
        System.out.println("[Connection is closed]");
      }
    } catch (SQLException exception) {
      System.out.println("[Failed connect to database]");
      System.out.println(exception.getLocalizedMessage());
    }
  }
}
