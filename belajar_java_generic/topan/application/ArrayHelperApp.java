package topan.application;

import topan.util.ArrayHelper;

public class ArrayHelperApp {
  public static void main(String[] args) {
    String[] names = { "Topan", "Sidiq", "Salsa", "Agustin", "Acaa" };
    Integer[] numbers = { 90, 99, 89, 87, 78, 91, 93 };

    System.out.println(ArrayHelper.<String>count(names));

    System.out.println(ArrayHelper.count(numbers));

    ArrayHelper.value(names);
  }
}
