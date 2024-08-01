package bank_app.utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Database {

  private static HikariDataSource hikariDataSource;

  static {
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("com.mysql.cj.jdbc.Driver");
    config.setUsername("root");
    config.setPassword("");
    config.setJdbcUrl("jdbc:mysql://localhost/topan_db");
    config.setMaximumPoolSize(10);
    config.setMinimumIdle(5);
    config.setIdleTimeout(50_000);
    config.setMaxLifetime(60 * 60 * 1000);

    hikariDataSource = new HikariDataSource(config);
  }

  public static HikariDataSource getDataSource() {
    return hikariDataSource;
  };

  HikariConfig config = new HikariConfig();
}
