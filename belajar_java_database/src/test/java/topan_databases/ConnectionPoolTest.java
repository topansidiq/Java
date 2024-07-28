package topan_databases;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPoolTest {
  @Test
  public void testHikariCP() throws InterruptedException {
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("com.mysql.cj.jdbc.Driver");
    config.setJdbcUrl("jdbc:mysql://localhost/belajar_java_database");
    config.setUsername("root");
    config.setPassword("");

    int maxPool = 100;
    int timeOut = 5_000;
    config.setMaximumPoolSize(maxPool);
    config.setMinimumIdle(maxPool / (maxPool / 2));
    config.setIdleTimeout(timeOut);
    config.setMaxLifetime(5 * timeOut);

    try {
      HikariDataSource dataSource = new HikariDataSource(config);
      Connection connection = dataSource.getConnection();
      System.out.println("[Success connect to database]");

      System.out.println("[Program finished]");
      connection.close();
      dataSource.close();
      if (connection.isClosed()) {
        System.out.println("[Connection is closed]");
      }
    } catch (SQLException exception) {
      System.out.println("[Failed connect to database]");
      System.out.println(exception.getLocalizedMessage());
    }
  }

  @Test
  public void testUtil() {
    try {
      Connection connection = ConnectUtil.getDataSource().getConnection();
      connection.close();
      System.out.println("Connection closed");
    } catch (SQLException exception) {
      System.out.println("Connection failed");
    }
  }
}
