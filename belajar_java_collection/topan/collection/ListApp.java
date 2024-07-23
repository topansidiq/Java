package topan.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
  public static void main(String[] args) {
    // Membuat collection List dengan ArrayList
    List<String> users = new ArrayList<>();

    // Menambah data baru
    users.add("topanisme");
    users.add("salsabila");

    // Mengambil data
    System.out.println(users.get(0));
    System.out.println(users.get(1));

    // Menghapus data
    users.remove(0);

    // Menampilkan data
    for (var user : users) {
      System.out.println(user);
    }

    // Mengambil data di index pertama
    System.out.println(users.getFirst());

    // Membuat collection dengan LinkedList
    List<Integer> numbers = new LinkedList<>();

    numbers.add(90);

    System.out.println(numbers.size());
    System.out.println(numbers.getFirst());
  }
}
