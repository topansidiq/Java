package topan.app;

import java.util.List;

import topan.data.Person;

public class MutableApp {
  public static void main(String[] args) {
    Person person = new Person("Topan Sidiq");
    person.addHobby("Ngoding");
    person.addHobby("Makan");

    for (var hobby : person.getHobbies()) {
      System.out.println(hobby);
    }
  }

  public static void doSomethingWithHobbies(List<String> hobbies) {
    hobbies.add("Bukan Hobby");
  }

}
