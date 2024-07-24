package topan.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
  public static void main(String[] args) {
    Map<Integer, String> map = new IdentityHashMap<>();

    for (int i = 0; i < 1000; i++) {
      map.put(i, "value" + i);
    }

    for (int i = 0; i < map.size() / 2; i++) {
      System.out.println(map.get(i));
    }
  }
}
