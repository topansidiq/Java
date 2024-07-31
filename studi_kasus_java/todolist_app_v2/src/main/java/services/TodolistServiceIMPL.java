package services;

import entities.Todolist;
import repositories.TodolistRepository;

public class TodolistServiceIMPL implements TodolistServices {

  private TodolistRepository todolistRepository;

  public TodolistServiceIMPL(TodolistRepository todolistRepository) {
    this.todolistRepository = todolistRepository;
  }

  @Override
  public void showTodoList() {
    Todolist[] todolists = todolistRepository.getAllTodo();
    System.out.println("\n\t[TODOLIST APPLICATION]");
    System.out.println("\nMY TODO\n");

    for (var todo : todolists) {
      System.out.println(todo.getId() + ". " + todo.getTodo() + " [" + todo.getDate() + "][" + todo.getTime() + "]");
    }
  }

  @Override
  public void addTodoList(String todo) {
    Todolist todolist = new Todolist(todo);
    todolistRepository.addTodo(todolist);
    System.out.println("NEW TODO: " + todo);
  }

  @Override
  public void removeTodoList(Integer number) {
    boolean success = todolistRepository.removeById(number);

    // Check apakah todo yang di hapus ada dan berhasil
    if (success) {
      System.out.println("SUCCESS REMOVE: " + number);
    } else {
      System.out.println("FAILED REMOVE: " + number);
    }
  }

}
