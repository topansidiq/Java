package repository;

import entity.Todolist;

public interface TodolistRepository {

  // Dapatkan semua data todo
  Todolist[] getAll();

  // Menambah todo baru
  void add(Todolist todolist);

  // Menghapus data todo
  boolean remove(Integer number);
}
