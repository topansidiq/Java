package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import entities.Todolist;

public class TodolistRepositoryIMPL implements TodolistRepository {

  private DataSource dataSource;

  public TodolistRepositoryIMPL(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void addTodo(Todolist todolist) {
    try (Connection connection = dataSource.getConnection()) {
      String sql = "INSERT INTO todolist(todo) VALUES (?)";

      try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, todolist.getTodo());
        statement.executeUpdate();
      }

    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public void editTodoById(Integer id) {
    // TODO Auto-generated method stub

  }

  @Override
  public Todolist[] getAllTodo() {
    String sql = "SELECT * FROM todolist";

    try (Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
      List<Todolist> list = new ArrayList<>();
      while (resultSet.next()) {
        Todolist todolist = new Todolist();
        todolist.setId(resultSet.getInt("id"));
        todolist.setTodo(resultSet.getString("todo"));
        todolist.setDate(resultSet.getDate("date"));
        todolist.setTime(resultSet.getTime("time"));
        list.add(todolist);
      }

      return list.toArray(new Todolist[] {});

    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }

  }

  @Override
  public void removeAllTodo(Todolist todolist) {
    // TODO Auto-generated method stub

  }

  private boolean isExists(Integer number) {
    String sql = "SELECT id FROM todolist WHERE id = ?";
    try (Connection connection = dataSource.getConnection()) {
      try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, number);
        try (ResultSet resultSet = statement.executeQuery()) {
          if (resultSet.next()) {
            return true;
          } else {
            return false;
          }
        }
      }

    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public boolean removeById(Integer id) {
    if (isExists(id)) {
      String sql = "DELETE FROM todolist WHERE id = ?";
      try (Connection connection = dataSource.getConnection()) {
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
          statement.setInt(1, id);
          statement.executeUpdate();
          return true;
        }
      } catch (SQLException exception) {
        throw new RuntimeException(exception);
      }
    } else {
      return false;
    }

  }

}
