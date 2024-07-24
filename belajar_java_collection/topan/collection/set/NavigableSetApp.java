package topan.collection.set;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
  public static void main(String[] args) {
    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("Topan", "Sidiq", "Salsa"));

    // Membalikan urutan
    NavigableSet<String> namesReversed = names.descendingSet();

    // Mengambil sebagian, dengan batasan inklusif (di ambil atau tidak)
    NavigableSet<String> atNames = names.headSet("Salsa", true);

    for (String name : names) {
      System.out.println(name);
    }

    for (String name : namesReversed) {
      System.out.println(name);
    }

    for (String name : atNames) {
      System.out.println(name);
    }

    NavigableSet<String> immuNavigableSet = Collections.unmodifiableNavigableSet(names);
    // immuNavigableSet.addFirst("Agustin"); // Ini error
    System.out.println(immuNavigableSet.first());
  }
}
