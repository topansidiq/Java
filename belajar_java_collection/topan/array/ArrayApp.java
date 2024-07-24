package topan.array;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
  public static void main(String[] args) {
    List<String> names = List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4");

    Object[] objects = names.toArray();
    String[] strings = names.toArray(new String[] {});

    System.out.println(Arrays.toString(objects));
    System.out.println(Arrays.toString(strings));
  }
}
