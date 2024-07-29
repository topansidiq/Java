package topan_databases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

public class StatementTest {
  @Test
  public void testStatement() throws SQLException {
    System.out.println("Program running");
    Connection connection = ConnectUtil.getDataSource().getConnection();

    System.out.println("Success connect to database");

    Statement statement = connection.createStatement();
    System.out.println("Success get access to database");

    System.out.println("Program finish");

    statement.close();
    System.out.println("Success closed access to database");

    connection.close();
    System.out.println("Success closed database");
  }

  @Test
  public void testExecuteUpdate() throws SQLException {
    System.out.println("Program running");
    Connection connection = ConnectUtil.getDataSource().getConnection();

    System.out.println("Success connect to database");

    Statement statement = connection.createStatement();
    System.out.println("Success get access to database");

    String sql = """
        INSERT INTO customers(id, name, email)
        VALUES (102, 'acaa', 'acaass@gmail.com')
        """;

    int update = statement.executeUpdate(sql);
    System.out.println(update);

    System.out.println("Program finish");

    statement.close();
    System.out.println("Success closed access to database");

    connection.close();
    System.out.println("Success closed database");
  }

  @Test
  public void testExecuteQuery() throws SQLException {
    System.out.println("Program running");
    Connection connection = ConnectUtil.getDataSource().getConnection();

    System.out.println("Success connect to database");

    Statement statement = connection.createStatement();
    System.out.println("Success get access to database");

    String sql = """
        SELECT * FROM customers
        """;

    ResultSet resultSet = statement.executeQuery(sql);
    resultSet.close();

    System.out.println("Program finish");

    statement.close();
    System.out.println("Success closed access to database");

    connection.close();
    System.out.println("Success closed database");
  }
}
