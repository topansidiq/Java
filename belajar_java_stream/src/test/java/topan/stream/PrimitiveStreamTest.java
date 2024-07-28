package topan.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.Test;

public class PrimitiveStreamTest {
  @Test
  public void testCreate() {
    IntStream intStream = IntStream.range(1, 30);
    intStream.forEach(value -> System.out.print("[" + value + "]"));
    System.out.println();
    LongStream longStream = LongStream.range(1000, 1020);
    var sumLong = longStream.sum();
    System.out.println(sumLong);
  }

  @Test
  public void testOperation() {
    IntStream intStream = IntStream.range(1, 100);

    OptionalDouble optionalDouble = intStream.average();

    System.out.println(optionalDouble);

    // int sumStream = intStream.sum();

    // System.out.println(sumStream);

    // OptionalInt maxStream = intStream.max();

    // System.out.println(maxStream);

    // OptionalInt minStream = intStream.min();

    // System.out.println(minStream);
  }
}
