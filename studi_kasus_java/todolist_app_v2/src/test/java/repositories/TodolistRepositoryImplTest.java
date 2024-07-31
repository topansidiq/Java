package repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariDataSource;

import entities.Todolist;
import utils.DBUtil;

public class TodolistRepositoryImplTest {

  private HikariDataSource dataSource;

  private TodolistRepository todolistRepository;

  @BeforeEach
  void setUp() {
    dataSource = DBUtil.getDataSource();
    todolistRepository = new TodolistRepositoryIMPL(dataSource);
  }

  @Test
  public void testAdd() {
    Todolist todolist = new Todolist();

    todolist.setTodo("Belajar Java Standard Classes");

    todolistRepository.addTodo(todolist);
  }

  @Test
  public void testRemoveTodoById() {
    System.out.println(todolistRepository.removeById(1));
    System.out.println(todolistRepository.removeById(2));
    System.out.println(todolistRepository.removeById(3));
    System.out.println(todolistRepository.removeById(4));
  }

  @Test
  public void testGetAllTodo() {
    todolistRepository.addTodo(
        new Todolist(
            "Belajar Java Generic"));

    Todolist[] todolists = todolistRepository.getAllTodo();

    for (var todo : todolists) {
      System.out.println(todo.getId() + ". " + todo.getTodo() + "[" + todo.getDate() + "][" + todo.getTime() + "]");
    }
  }

  @AfterEach
  void tearDown() {
    dataSource.close();
  }

}
