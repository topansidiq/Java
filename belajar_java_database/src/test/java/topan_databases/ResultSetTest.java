package topan_databases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import topan_databases.utils.ConnectUtil;

public class ResultSetTest {
  @Test
  public void testResultTest() throws SQLException {
    System.out.println("Program running");
    Connection connection = ConnectUtil.getDataSource().getConnection();

    System.out.println("Success connect to database");

    Statement statement = connection.createStatement();
    System.out.println("Success get access to database");

    String sql = """
        SELECT * FROM customers
        """;

    ResultSet resultSet = statement.executeQuery(sql);

    while (resultSet.next()) {
      String id = resultSet.getString("id");
      String name = resultSet.getString("name");
      String email = resultSet.getString("email");

      System.out.println("Data customer [" + id + "]");
      System.out.println("\tID\t: " + id);
      System.out.println("\tName\t: " + name);
      System.out.println("\tEmail\t: " + email);
    }

    resultSet.close();

    System.out.println("Program finish");

    statement.close();
    System.out.println("Success closed access to database");

    connection.close();
    System.out.println("Success closed database");
  }
}
