package view;

import service.TodolistServices;
import utils.InputUtil;

public class TodolistView {

  private TodolistServices todolistServices;

  public TodolistView(TodolistServices todolistService) {
    this.todolistServices = todolistService;
  }

  // Tampilan todo
  public void showTodoList() {
    while (true) {
      todolistServices.showTodoList();
      System.out.println("(1) Tambah | (2) Hapus | (x) Keluar");

      var input = InputUtil.input("");

      if (input.equals("1")) {
        addTodoList();
      } else if (input.equals("2")) {
        removeTodoList();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak dimengerti");
      }
    }
  }

  // Tampilan tambah todo
  public void addTodoList() {
    System.out.println("MENAMBAH TODOLIST");

    var todo = InputUtil.input("Todo (x Jika Batal)");

    if (todo.equals("x")) {
      // batal
    } else {
      todolistServices.addTodoList(todo);
    }
  }

  // Tampilan menghapus todo
  public void removeTodoList() {
    System.out.println("MENGHAPUS TODOLIST");

    var number = InputUtil.input("Nomor yang Dihapus (x Jika Batal)");

    if (number.equals("x")) {
      // batal
    } else {
      todolistServices.removeTodoList(Integer.valueOf(number));
    }
  }

}
