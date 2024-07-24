package topan.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedListHashMapApp {
  public static void main(String[] args) {
    Map<Integer, String> map = new LinkedHashMap<>();

    map.put(1, "Topan");
    map.put(2, "Sidiq");

    Set<Integer> keys = map.keySet();
    for (Integer key : keys) {
      System.out.println(key);
    }
  }
}
