package lambda_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveIfApp {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.addAll(List.of("Topan", "Salsa", "Topan", "Salsa"));

    if (names.removeIf(name -> name.length() > 5)) {
      System.out.println("Elemen berhasil dihapus!");
      names.forEach(System.out::println);
    } else {
      System.out.println("Elemen tidak ditemukan!");
      names.forEach(System.out::println);
    }
  }
}
