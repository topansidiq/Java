package topan.collection;

import java.util.Iterator;
import java.util.List;

public class ItterableApp {

  public static void main(String[] args) {

    Iterable<String> usernames = List.of("topanisme", "salsabila.agustin", "angin.ribut");

    System.out.println("\nITERABLE");
    for (var username : usernames) {
      System.out.println(username);
    }

    System.out.println("\nITERATOR");
    Iterator<String> iterator = usernames.iterator();

    while (iterator.hasNext()) {
      String username = iterator.next();
      System.out.println(username);
    }

  }
}