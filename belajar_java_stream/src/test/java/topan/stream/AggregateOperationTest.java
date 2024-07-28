package topan.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AggregateOperationTest {
  @Test
  public void testMin() {
    List.of("Topan 1", "Topan 1", "Topan 3", "Topan 4")
        .stream()
        .min(Comparator.naturalOrder())
        .ifPresent(System.out::println);
  }

  @Test
  public void testMax() {
    List.of("Topan 1", "Topan 1", "Topan 3", "Topan 4")
        .stream()
        .max(Comparator.naturalOrder())
        .ifPresent(System.out::println);
  }

  @Test
  public void testCount() {
    long count = List.of("Topan 1", "Topan 1", "Topan 3", "Topan 4")
        .stream()
        .count();
    System.out.println(count);
  }

  @Test
  public void testReduce() {
    var result = List.of(1, 6, 5, 4, 7, 0)
        .stream()
        .reduce(0, (value, item) -> value + item);

    System.out.println(result);
  }

  @Test
  public void testFactorial() {
    var factorial = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .stream()
        .reduce(1, (value, item) -> value * item);

    System.out.println(factorial);
  }
}
