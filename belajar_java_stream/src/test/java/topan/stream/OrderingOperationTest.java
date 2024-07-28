package topan.stream;

// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Deque;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderingOperationTest {

  // Comparator<String> comparator = new Comparator<String>() {

  // private Deque<String> deque = new ArrayDeque<>();
  // @Override
  // public ArrayList<String> stringLengthSorted(List<String> strings){
  // ArrayList<String> newStrings = strings.toArray();
  // for (int i = 0; i < strings.size(); i++) {
  // if (strings.get(i).length() > strings[i + 1].length()){
  // deque.addLast(strings.get(i));
  // } else {
  // deque.addFirst(strings.get(i));
  // }

  // return deque.toArray();
  // }
  // }
  // };

  @Test
  public void testOrdering() {
    List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4").stream()
        .sorted()
        .forEach(System.out::println);
  }

  @Test
  public void testSortedWithComparator() {

  }
}
