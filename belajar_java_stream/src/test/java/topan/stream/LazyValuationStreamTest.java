package topan.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LazyValuationStreamTest {
  @Test
  public void testIntermediateOperation() {
    List<String> names = List.of("Topan", "Sidiq", "Salsa");
    Stream<String> streamUpper = names.stream().map(name -> {
      System.out.println("Change " + name);
      return name.toUpperCase();
    });
  }
}
