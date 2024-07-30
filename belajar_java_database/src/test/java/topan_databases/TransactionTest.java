package topan_databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import topan_databases.utils.ConnectUtil;

public class TransactionTest {
  @Test
  public void testCommit() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    connection.setAutoCommit(false);

    String sql = "INSERT INTO comments (email, comment) VALUES (?, ?)";

    for (int i = 0; i < 100; i++) {
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, "topan" + i + "@pnp.ac.id");
      preparedStatement.setString(2, "Yaudah ke-" + i);
      preparedStatement.executeUpdate();
      preparedStatement.close();
    }

    connection.commit(); // Jika ini di jalankan maka data akan di simpan
    connection.close();
  }

  @Test
  public void testRollback() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    connection.setAutoCommit(false);

    String sql = "INSERT INTO comments (email, comment) VALUES (?, ?)";

    for (int i = 0; i < 100; i++) {
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, "topan" + i + "@pnp.ac.id");
      preparedStatement.setString(2, "Yaudah ke-" + i);
      preparedStatement.executeUpdate();
      preparedStatement.close();
    }

    connection.rollback(); // Jika ini di jalankan maka data akan di simpan
    connection.close();
  }
}
