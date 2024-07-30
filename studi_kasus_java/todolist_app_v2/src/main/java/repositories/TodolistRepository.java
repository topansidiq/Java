package repositories;

import entities.Todolist;

public interface TodolistRepository {
  void addTodo(Todolist todolist);

  void editTodoById(Integer id);

  void removeById(Integer id);

  void removeAllTodo(Todolist todolist);

  Todolist[] getAllTodo();
}
