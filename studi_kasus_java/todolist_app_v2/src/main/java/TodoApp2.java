import javax.sql.DataSource;

import repositories.TodolistRepository;
import repositories.TodolistRepositoryIMPL;
import services.TodolistServiceIMPL;
import services.TodolistServices;
import utils.DBUtil;
import view.TodolistView;

public class TodoApp2 {
  public static void main(String[] args) {
    DataSource dataSource = DBUtil.getDataSource();
    TodolistRepository todolistRepository = new TodolistRepositoryIMPL(dataSource);
    TodolistServices todolistServices = new TodolistServiceIMPL(todolistRepository);
    TodolistView todolistView = new TodolistView(todolistServices);

    todolistView.showTodoList();
  }
}
