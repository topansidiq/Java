package topan.map;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
  public static void main(String[] args) {
    NavigableMap<String, String> map = new TreeMap<>();

    map.put("Topan", "Topan");
    map.put("Sidiq", "Sidiq");
    map.put("Salsa", "Salsa");

    for (var key : map.keySet()) {
      System.out.println(key);
    }

    System.out.println(map.lowerKey("Topan"));
    System.out.println(map.higherKey("Topan"));
    System.out.println(map.floorKey("Agustin"));
    System.out.println(map.ceilingKey("Acaa"));

    NavigableMap<String, String> mapDesc = map.descendingMap();
    for (var key : mapDesc.keySet()) {
      System.out.println(key);
    }

    NavigableMap<String, String> empty = Collections.emptyNavigableMap();
    NavigableMap<String, String> immutableNavigableMap = Collections.unmodifiableNavigableMap(map);

    System.out.println(empty);
    System.out.println(immutableNavigableMap);
  }
}
