package topan.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EntryMapApp {
  public static void main(String[] args) {
    Map<String, String> map = new TreeMap<>();

    map.put("Topan", "Topan");
    map.put("Sidiq", "Sidiq");
    map.put("Salsa", "Salsa");

    Set<Map.Entry<String, String>> entries = map.entrySet();
    System.out.println(entries.size());

    for (var entry : entries) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
