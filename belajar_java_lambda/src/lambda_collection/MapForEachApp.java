package lambda_collection;

import java.util.HashMap;
import java.util.Map;

public class MapForEachApp {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    for (int i = 1; i < 17; i++) {
      map.put(i, "Value " + i);
    }

    map.forEach((key, value) -> System.out.println(key + ". " + value));
  }
}
