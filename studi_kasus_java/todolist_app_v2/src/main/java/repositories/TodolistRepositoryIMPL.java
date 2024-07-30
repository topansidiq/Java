package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import entities.Todolist;

public class TodolistRepositoryIMPL implements TodolistRepository {

  public Todolist[] data = new Todolist[10];

  private DataSource dataSource;

  public TodolistRepositoryIMPL(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void addTodo(Todolist todolist) {
    try (Connection connection = dataSource.getConnection()) {
      String sql = "INSERT INTO todolist(todo, date, time) VALUES (?, ?, ?)";

      try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, todolist.getTodo());
        statement.setDate(2, todolist.getDate());
        statement.setTime(3, todolist.getTime());
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
    return data;
    // TODO Auto-generated method stub

  }

  @Override
  public void removeAllTodo(Todolist todolist) {
    // TODO Auto-generated method stub

  }

  @Override
  public void removeById(Integer id) {
    // TODO Auto-generated method stub

  }

}
