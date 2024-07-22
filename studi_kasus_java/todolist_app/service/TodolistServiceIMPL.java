package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceIMPL implements TodolistServices {

  private TodolistRepository todolistRepository;

  public TodolistServiceIMPL(TodolistRepository todolistRepository) {
    this.todolistRepository = todolistRepository;
  }

  @Override
  public void showTodoList() {
    Todolist[] model = todolistRepository.getAll();
    System.out.println("\n\t[TODOLIST APPLICATION]");
    System.out.println("\nMY TODO\n");

    for (var i = 0; i < model.length; i++) {
      var todolist = model[i];
      var no = i + 1;

      if (todolist != null) {
        System.out.println(no + ". " + todolist.getTodo());
      }
    }
  }

  @Override
  public void addTodoList(String todo) {
    Todolist todolist = new Todolist(todo);
    todolistRepository.add(todolist);
    System.out.println("NEW TODO: " + todo);
  }

  @Override
  public void removeTodoList(Integer number) {
    boolean success = todolistRepository.remove(number);

    // Check apakah todo yang di hapus ada dan berhasil
    if (success) {
      System.out.println("SUCCESS REMOVE: " + number);
    } else {
      System.out.println("FAILED REMOVE: " + number);
    }
  }

}
