package topan_databases;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectUtil {
  private static HikariDataSource dataSource;
  static {
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("com.mysql.cj.jdbc.Driver");
    config.setJdbcUrl("jdbc:mysql://localhost/belajar_java_database");
    config.setUsername("root");
    config.setPassword("");

    int maxPool = 100;
    int timeOut = 60_000;
    config.setMaximumPoolSize(maxPool);
    config.setMinimumIdle(maxPool / (maxPool / 2));
    config.setIdleTimeout(timeOut);
    config.setMaxLifetime(5 * timeOut);

    dataSource = new HikariDataSource(config);
  }

  public static HikariDataSource getDataSource() {
    return dataSource;
  }

}
