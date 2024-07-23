package topan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
  public static void main(String[] args) {
    Collection<String> emails = new ArrayList<>();

    emails.add("topansidiq28@gmail.com");
    emails.add("topansidiq7@gmail.com");
    emails.add("salsabilaagustinpy@gmail.com");
    emails.add("mrpangaming@gmail.com");
    emails.addAll(List.of("contohemail1@gmail.com", "contohemail2@gmail.com"));

    for (String email : emails) {
      System.out.println(email);
    }

    if (emails.remove("topansidiq7@gmail.com")) {
      System.out.println("Remove Success");
    }
    emails.removeAll(List.of("mrpangaming@gmail.com", "contohemail2@gmail.com"));

    for (String email : emails) {
      System.out.println(email);
    }

    if (emails.contains("topansidiq28@gmail.com")) {
      System.out.println("True");
    }
  }
}
