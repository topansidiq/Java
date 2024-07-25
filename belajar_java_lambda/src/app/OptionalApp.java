package app;

import java.util.Optional;

public class OptionalApp {
  public static void main(String[] args) {
    sayHello("Topan Sidiq");
  }

  public static void sayHello(String name) {

    Optional.ofNullable(name).map(String::toUpperCase).ifPresent(System.out::println);
    Optional.ofNullable(name).map(String::toUpperCase).ifPresentOrElse(value -> System.out.println("HELLO " + value),
        () -> System.out.println("HELLO"));
    Optional.ofNullable(name).map(String::toUpperCase).orElse("TEMAN");

    // Optional<String> optional = Optional.ofNullable(name);
    // Optional<String> upperName = optional.map(value -> value.toUpperCase());

    // // String nameUpper = name.toUpperCase();
    // System.out.println("HELLO " + upperName.get());
    // upperName.ifPresent(value -> System.out.println("HELLO " + value));
    // upperName.ifPresent(System.out::println);
  }
}
