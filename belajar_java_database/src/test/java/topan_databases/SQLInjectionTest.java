package topan_databases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

public class SQLInjectionTest {
  @Test
  public void testSQLInjection() throws SQLException {
    System.out.println("Program running");
    Connection connection = ConnectUtil.getDataSource().getConnection();

    System.out.println("Success connect to database");

    Statement statement = connection.createStatement();
    System.out.println("Success get access to database");

    String username = "topanisme";
    String password = "100";

    String sql = "SELECT * FROM admin WHERE username = '" + username + "' AND PASSWORD = '" + password + "'";

    ResultSet resultSet = statement.executeQuery(sql);

    if (resultSet.next()) {
      System.out.println("Success login for username: '" + username + "'");
    } else {
      System.out.println("Can not login. Username '" + username + "' not found");
    }

    resultSet.close();

    System.out.println("Program finish");

    statement.close();
    System.out.println("Success closed access to database");

    connection.close();
    System.out.println("Success closed database");
  }
}
