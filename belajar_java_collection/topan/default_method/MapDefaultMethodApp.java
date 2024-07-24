package topan.default_method;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
  public static void main(String[] args) {
    Map<Integer, String> numbers = new HashMap<>();

    numbers.put(1, "topan");
    numbers.put(2, "salsa");
    numbers.put(3, "sidiq");

    numbers.forEach(new BiConsumer<Integer, String>() {
      public void accept(Integer key, String value) {
        System.out.println(key + " : " + value);
      }
    });

  }
}
