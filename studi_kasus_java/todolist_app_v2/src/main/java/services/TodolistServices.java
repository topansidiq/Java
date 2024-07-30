package services;

public interface TodolistServices {

  // Menampilkan semua todolist
  void showTodoList();

  // Menambahkan todolist baru
  void addTodoList(String todo);

  // Menghapus todolist
  void removeTodoList(Integer number);

}
