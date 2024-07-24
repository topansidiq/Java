package topan.stack;

import java.util.Stack;

public class StackApp {
  public static void main(String[] args) {
    Stack<String> names = new Stack<>();
    names.push("Topan Sidiq");
    names.push("Topan Sidiq 2");
    names.push("Topan Sidiq 22");

    for (var name : names) {
      System.out.println(name);
    }
  }
}
