package belajar_java_standard_classes;

import java.util.UUID;

public class UUIDs {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      UUID uuid = UUID.randomUUID();
      String key = uuid.toString();
      System.out.println(key);
    }
  }
}
