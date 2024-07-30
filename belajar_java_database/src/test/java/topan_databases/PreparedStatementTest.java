package topan_databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import topan_databases.utils.ConnectUtil;

public class PreparedStatementTest {
  @Test
  public void testPrepareStatement() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();

    String username = "topanisme";
    String password = "100";
    String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";

    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, username);
    preparedStatement.setString(2, password);

    ResultSet resultSet = preparedStatement.executeQuery();

    if (resultSet.next()) {
      System.out.println("Login success " + username);
    } else {
      System.out.println("Login failed");
    }

    preparedStatement.close();
    connection.close();
  }
}
