package topan.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilteringOperationTest {
  @Test
  public void testFilter() {
    List.of(90, 89, 78, 80, 72, 79, 91, 88, 85)
        .stream()
        .filter(value -> value > 80)
        .forEach(value2 -> {
          System.out.println("Nilai anda " + value2 + ". Anda lulus!");
        });

    List.of(90, 89, 78, 80, 72, 79, 91, 88, 85)
        .stream()
        .map(value -> {
          if (value <= 80) {
            return "Nilai anda " + value + ". Anda tidak lulus!";
          } else {
            return "Nilai anda " + value + ". Anda lulus!";
          }
        })
        .forEach(System.out::println);
  }

  @Test
  public void testDistinct() {
    List.of("Topan 1", "Topan 1", "Topan 3", "Topan 4")
        .stream()
        .distinct()
        .forEach(System.out::println);
  }

}
