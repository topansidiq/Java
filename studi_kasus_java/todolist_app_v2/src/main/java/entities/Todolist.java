package entities;

import java.sql.Date;
import java.sql.Time;

public class Todolist {
  private Integer id;
  private String todo;
  private Date date;
  private Time time;

  public Todolist(Integer id, String todo, Date date, Time time) {
    this.id = id;
    this.todo = todo;
    this.date = date;
    this.time = time;
  }

  public Todolist(String todo, Date date, Time time) {
    this.todo = todo;
    this.date = date;
    this.time = time;
  }

  public Todolist() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTodo() {
    return todo;
  }

  public void setTodo(String todo) {
    this.todo = todo;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

}
