package topan_databases;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import topan_databases.utils.ConnectUtil;

public class MetadataTest {
  @Test
  public void testDatabaseMetadata() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    DatabaseMetaData databaseMetaData = connection.getMetaData();

    System.out.println(databaseMetaData.getDatabaseProductName());
    System.out.println(databaseMetaData.getDatabaseProductVersion());
    System.out.println(databaseMetaData.getDriverName());
    System.out.println(databaseMetaData.getDriverVersion());

    ResultSet resultSet = databaseMetaData.getTables("belajar_java_database", null, null, null);

    while (resultSet.next()) {
      String tableName = resultSet.getString("TABLE_NAME");
      System.out.println("Table: " + tableName);
    }

    connection.close();
  }

  @Test
  public void testParameterMetadata() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();
    String sql = "INSERT INTO comments(email, comment) VALUES(?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);

    ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();

    System.out.println("Parameter count: " + parameterMetaData.getParameterCount());

    preparedStatement.close();
    connection.close();
  }

  @Test
  public void testResultSetMetadata() throws SQLException {
    Connection connection = ConnectUtil.getDataSource().getConnection();

    Statement statement = connection.createStatement();

    ResultSet resultSet = statement.executeQuery("SELECT * FROM sample_time");

    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

    for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
      System.out.println("Name: " + resultSetMetaData.getColumnName(i));
      System.out.println("Type: " + resultSetMetaData.getColumnType(i));
      System.out.println("Type name: " + resultSetMetaData.getColumnTypeName(i));
    }

    resultSet.close();
    statement.close();
    connection.close();
  }
}
