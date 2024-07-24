package topan.hash_table;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
  public static void main(String[] args) {
    Map<String, String> map = new Hashtable<>();
    map.put("Topan", "Sidiq1");
    map.put("Topan", "Sidiq3");
    map.put("Topan", "Sidiq6");

    for (var key : map.keySet()) {
      System.out.println(key);
    }
  }
}
