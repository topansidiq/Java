package topan.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Exercise {

  private Scanner input = new Scanner(System.in);
  private Collection<String> users = new ArrayList<>();

  public class User {

    private String username;
    private String password;

    public User(String username, String password) {
      this.username = username;
      this.password = password;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

  }

  void addNewUser(String username, String password) {
    users.add(username);
    // User user = new User(username, password);
  }

  void signIn() {
    System.out.print("Masukkan username: ");
    var username = input.next();
    System.out.print("Masukkan password: ");
    var password = input.next();
    addNewUser(username, password);
  }

}
