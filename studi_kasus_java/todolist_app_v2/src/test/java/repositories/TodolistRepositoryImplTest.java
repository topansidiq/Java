package repositories;

import java.sql.Date;
import java.sql.Time;

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

    todolist.setTodo("Belajar Java OOP");
    todolist.setDate(new Date(System.currentTimeMillis()));
    todolist.setTime(new Time(System.currentTimeMillis()));

    todolistRepository.addTodo(todolist);
  }

  @AfterEach
  void tearDown() {
    dataSource.close();
    ;
  }
}
