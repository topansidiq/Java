package app;

import java.util.function.Predicate;

public class PredicateApp {
  public static void main(String[] args) {
    Predicate<String> predicate = value -> value.isBlank();
    System.out.println(predicate.test("Topan"));
  }
}
