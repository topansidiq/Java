package entity;

public class Todolist {
  // Attribute
  private String todo;

  // Constructor
  public Todolist(String todo) {
    this.todo = todo;
  }

  public Todolist() {

  }

  // Getter Setter
  public String getTodo() {
    return todo;
  }

  public void setTodo(String todo) {
    this.todo = todo;
  }
}
