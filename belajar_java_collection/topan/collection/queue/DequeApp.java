package topan.collection.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
  public static void main(String[] args) {
    Deque<Integer> valuesDeque = new LinkedList<>();
    valuesDeque.addFirst(90);
    valuesDeque.addFirst(80);
    valuesDeque.addFirst(87);

    for (Integer integer : valuesDeque) {
      System.out.println(integer);
    }
  }
}
