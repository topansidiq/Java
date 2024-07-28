package topan.stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class RetrievingOperationTest {
  @Test
  public void testLimit() {
    List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4")
        .stream()
        .limit(2)
        .forEach(System.out::println);
  }

  @Test
  public void testSkip() {
    List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4")
        .stream()
        .skip(1)
        .forEach(System.out::println);
  }

  @Test
  public void testTakeWhile() {
    List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4", "Topan 5")
        .stream()
        .takeWhile(name -> name.length() <= 9)
        .forEach(System.out::println);
  }

  @Test
  public void testDropWhile() {
    List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4", "Topan 5", "Topan Sidiq 6")
        .stream()
        .dropWhile(name -> name.length() <= 9)
        .forEach(System.out::println);
  }

  @Test
  public void testFindAny() {
    Optional<String> optional = List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4", "Topan 5", "Topan Sidiq 6")
        .stream()
        .findAny();

    optional.ifPresent(name -> {
      System.out.println(name);
    });

  }

  @Test
  public void testFindFirst() {
    Optional<String> optional = List.of("Topan 1", "Topan 2", "Topan 3", "Topan 4", "Topan 5")
        .stream()
        .findFirst();

    optional.ifPresent(name -> {
      System.out.println(name);
    });

  }

}
