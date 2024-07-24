package topan.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
  public static void main(String[] args) {
    List<Integer> nilai = new ArrayList<>(1000);

    for (int i = 1; i < 1000; i++) {
      nilai.add(i);
    }

    System.out.println(Collections.binarySearch(nilai, 333));
  }
}
