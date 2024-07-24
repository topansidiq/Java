package topan.spliterator;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
  public static void main(String[] args) {
    List<String> names = List.of("Topan Sidiq", "Salsabila Agustin", "Acaa");
    Spliterator<String> spliterator1 = names.spliterator();
    Spliterator<String> spliterator2 = spliterator1.trySplit();

    System.out.println(spliterator1.estimateSize());
    System.out.println(spliterator2.estimateSize());

    spliterator1.forEachRemaining(new Consumer<String>() {
      public void accept(String s) {
        System.out.println(s);
      }
    });
  }
}
