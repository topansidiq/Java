package repositories;

import entities.Todolist;

public interface TodolistRepository {
  void addTodo(Todolist todolist);

  void editTodoById(Integer id);

  void removeAllTodo(Todolist todolist);

  boolean removeById(Integer id);

  Todolist[] getAllTodo();
}
