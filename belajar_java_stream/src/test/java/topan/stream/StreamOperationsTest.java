package topan.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamOperationsTest {
  @Test
  public void testStreamOperation() {
    List<String> names = List.of("Topan", "Sidiq", "Salsa");

    Stream<String> streamNames = names.stream();
    Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());

    streamUpper.forEach(System.out::println);
  }
}
