package topan.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ParallelStreamTest {
  @Test
  public void testSequential() {
    Stream.of(1, 2, 3, 4, 5, 6, 90, 1000, 77, 8).parallel().forEach(number -> {
      System.out.println(Thread.currentThread().getName() + " - " + number);
    });
  }
}
