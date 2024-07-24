package topan.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
  public static void main(String[] args) {
    // HashSet
    Set<String> names = new HashSet<>();
    names.add("Topan");
    names.add("Sidiq");
    names.add("Salsa");

    for (var name : names) {
      System.out.println(name.hashCode() + "[" + name + "]");
    }

    // LinkedHashSet
    Set<Integer> numbers = new LinkedHashSet<>();
    numbers.add(90);
    numbers.add(89);
    numbers.add(78);

    for (var number : numbers) {
      System.out.println(number.hashCode() + "[" + number + "]");
    }
  }
}
