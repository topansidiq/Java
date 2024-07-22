import repository.TodolistRepository;
import repository.TodolistRepositoryIMPL;
import service.TodolistServiceIMPL;
import service.TodolistServices;
import view.TodolistView;

public class TodoApp2 {
  public static void main(String[] args) {
    TodolistRepository todolistRepository = new TodolistRepositoryIMPL();
    TodolistServices todolistServices = new TodolistServiceIMPL(todolistRepository);
    TodolistView todolistView = new TodolistView(todolistServices);

    todolistView.showTodoList();
  }
}
