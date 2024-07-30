package topan_databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import topan_databases.utils.ConnectUtil;

public class BatchTest {
  @Test
  public void testStatement() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    Statement statement = connection.createStatement();
    String sql = "INSERT INTO comments (email, comment) VALUES (?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);

    for (int i = 0; i < 1000; i++) {
      preparedStatement.clearParameters();
      preparedStatement.setString(1, "topan" + i + "@pnp.ac.id");
      preparedStatement.setString(2, "Yaudah ke-" + i);
      preparedStatement.addBatch();
    }

    preparedStatement.executeBatch();

    preparedStatement.close();
    statement.close();
    connection.close();
  }
}
