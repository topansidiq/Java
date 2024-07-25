package lambda_collection;

import java.util.List;

public class IterableForEachApp {
  public static void main(String[] args) {
    List<String> names = List.of("Topan", "Sidiq", "Salsabila", "Agustin");

    names.forEach(name -> System.out.println(name));

    names.forEach(System.out::println);
  }
}
