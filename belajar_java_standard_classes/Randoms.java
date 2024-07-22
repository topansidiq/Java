package belajar_java_standard_classes;

import java.util.Random;

public class Randoms {
  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      var value = random.nextInt(10000);
      if (value % 2 == 0) {
        var value2 = random.nextExponential();
        if (value2 >= 1) {
          System.out.println("[    ]");
        }
        System.out.println(value2);
      }
      System.out.println(value);
    }

  }
}
