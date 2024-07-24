package topan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(100);

    for (int i = 1; i < 100; i++) {
      numbers.add(i + (i * 2));
      System.out.println(numbers.get(i - 1));
    }

    Collections.reverse(numbers);

    for (Integer number : numbers) {
      System.out.println(number);
    }

    Collections.shuffle(numbers);

    for (int i = 0; i < 30; i++) {
      System.out.println(numbers.get(i));
    }
  }
}
