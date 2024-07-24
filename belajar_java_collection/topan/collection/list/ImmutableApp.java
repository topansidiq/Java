package topan.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
  public static void main(String[] args) {
    List<String> one = Collections.singletonList("Satu aja");
    List<String> empty = Collections.emptyList();

    List<String> mutable = new ArrayList<>();
    mutable.add("Topan");
    mutable.add("Sidiq");
    List<String> immutable = Collections.unmodifiableList(mutable);

    System.out.println(one.getFirst());
    System.out.println(empty.size());
    System.out.println(mutable.getLast());
    System.out.println(immutable.size());
  }
}
