package topan_databases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import topan_databases.utils.ConnectUtil;

public class DateTest {
  @Test
  public void testDate() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    Statement statement = connection.createStatement();
    String sql = """
        INSERT INTO sample_time(sample_time, sample_date, sample_timestamp) VALUES (?, ?, ?)
        """;
    PreparedStatement preparedStatement = connection.prepareStatement(sql);

    preparedStatement.setTime(1, new Time(System.currentTimeMillis()));
    preparedStatement.setDate(2, new Date(System.currentTimeMillis()));
    preparedStatement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

    preparedStatement.executeUpdate();

    preparedStatement.close();
    statement.close();
    connection.close();
  }

  @Test
  public void testDateQuery() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    Statement statement = connection.createStatement();
    String sql = """
        SELECT * FROM sample_time
        """;
    PreparedStatement preparedStatement = connection.prepareStatement(sql);

    ResultSet resultSet = preparedStatement.executeQuery();

    while (resultSet.next()) {
      Time time = resultSet.getTime("sample_time");
      Date date = resultSet.getDate("sample_date");
      Timestamp timestamp = resultSet.getTimestamp("sample_timestamp");
      System.out.println("Time\t\t: " + time);
      System.out.println("Date\t\t: " + date);
      System.out.println("Timestamp\t: " + timestamp);
    }

    resultSet.close();
    preparedStatement.close();
    statement.close();
    connection.close();
  }
}
