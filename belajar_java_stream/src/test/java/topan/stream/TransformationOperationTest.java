package topan.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TransformationOperationTest {
  @Test
  public void testMap() {
    List.of("Topan", "Sidiq", "Salsa")
        .stream()
        .map(value -> value.toString())
        .map(hash -> {
          return "hash " + hash.hashCode();
        })
        .forEach(System.out::println);
  }

  @Test
  public void testFlatMap() {
    // List.of("Topan 1", "Topan 2", "Topan 3")
    // .stream()
    // .map(name -> name.toUpperCase())
    // .flatMap(upper -> Stream.of(upper, upper.length()))
    // .forEach(value -> System.out.println(value));

    List.of("Topan 1", "Sidiq 2", "Salsa 3")
        .stream()
        .map(name -> name.toUpperCase())
        .flatMap(value -> Stream.of(value, value.toLowerCase(), value.length(), value.hashCode()))
        .forEach(value2 -> {
          System.out.println("- " + value2);
        });
  }
}
