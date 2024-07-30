package topan_databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import topan_databases.utils.ConnectUtil;

public class AutoIncrementTest {

  @Test
  public void testAutoIncrement() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    Statement statement = connection.createStatement();
    String sql = "INSERT INTO comments (email, comment) VALUES (?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

    preparedStatement.setString(1, "topan" + 1 + "@pnp.ac.id");
    preparedStatement.setString(2, "Yaudah ke-" + 1);

    preparedStatement.executeUpdate();

    ResultSet resultSet = preparedStatement.getGeneratedKeys();

    if (resultSet.next()) {
      System.out.println("Id comment: " + resultSet.getString(1));
    }

    resultSet.close();
    preparedStatement.close();
    statement.close();
    connection.close();
  }
}
