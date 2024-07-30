package utils;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariDataSource;

public class DBUtilTest {
  @Test
  public void testConnection() throws SQLException {
    HikariDataSource dataSource = DBUtil.getDataSource();

    Connection connection = dataSource.getConnection();

    connection.close();
    dataSource.close();
  }
}
