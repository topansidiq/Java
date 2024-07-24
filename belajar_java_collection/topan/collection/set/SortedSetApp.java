package topan.collection.set;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import topan.data.Person;
import topan.data.PersonComparator;

public class SortedSetApp {
  public static void main(String[] args) {
    SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
    people.add(new Person("Topan"));
    people.add(new Person("Sidiq"));
    people.add(new Person("Salsa"));

    for (Person person : people) {
      System.out.println(person.getName());
    }

    SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
    // people.add("Topan");
    // people.add("Sidiq");
    // people.add("Salsa");
    System.out.println(sortedSet.first());
  }
}
