package topan.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LazyValuationStreamTest {
  @Test
  public void testIntermediateOperation() {
    List<String> names = List.of("Topan", "Sidiq", "Salsa");
    names.stream().map(name -> {
      System.out.println("Change " + name);
      return name.toUpperCase();
    }).forEach(System.out::println);
  }

  @Test
  public void testTerminalOperation() {
    List<String> names = List.of("Topan", "Sidiq", "Salsa");
    names.stream().map(name -> {
      System.out.println("Change " + name + " to " + name.toUpperCase());
      return name.toUpperCase();
    }).forEach(upper -> {
      System.out.println(upper);
    });
    ;
  }
}
