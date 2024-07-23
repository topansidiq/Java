package topan.util;

public class ArrayHelper {
  public static <T> int count(T[] array) {
    return array.length;
  }

  public static <T> void value(T[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      if (i > array.length - 2) {
        System.out.print(array[i]);
        continue;
      }
      System.out.print(array[i] + ", ");
    }
    System.out.print("]");
  }
}
