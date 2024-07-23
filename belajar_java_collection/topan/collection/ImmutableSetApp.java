package topan.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
  public static void main(String[] args) {
    Set<String> emptySet = Collections.emptySet();
    Set<String> oneSet = Collections.singleton("Topan");

    Set<String> mutable = new HashSet<>();
    mutable.add("Topan");
    mutable.add("Sidiq");
    Set<String> immutable = Collections.unmodifiableSet(mutable);

    Set<String> set = Set.of("Topan", "Sidiq");

    System.out.println(emptySet.size());
    System.out.println(oneSet.hashCode());
    System.out.println(mutable.size());
    System.out.println(immutable.isEmpty());
    System.out.println(set.iterator());

  }
}
