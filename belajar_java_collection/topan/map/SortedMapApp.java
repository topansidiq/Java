package topan.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {

  public static void main(String[] args) {
    Comparator<String> comparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    };

    SortedMap<String, String> sortedMap = new TreeMap<>(comparator);
    sortedMap.put("version", "1.0.0");
    sortedMap.put("appName", "Belajar Java Collection");

    for (var key : sortedMap.keySet()) {
      System.out.println(key);
    }

    SortedMap<String, String> empty = Collections.emptySortedMap();
    SortedMap<String, String> immutableSortedMap = Collections.unmodifiableSortedMap(sortedMap);

    System.out.println(empty);
    System.out.println(immutableSortedMap);
  }
}
