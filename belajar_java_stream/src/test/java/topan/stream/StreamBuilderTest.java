package topan.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamBuilderTest {
  @Test
  public void testCreateStreamBuilder() {
    Stream.Builder<String> builder = Stream.builder();
    builder.add("Topan").add("Sidiq").add("Salsa").add("Acaa");
    builder.accept("Salto");

    Stream<String> stream = builder.build();
    stream.forEach(value -> {
      System.out.println(value);
    });
  }

  @Test
  public void testCreateSimpleStreamBuilder() {
    Stream<Object> stream = Stream.builder().add("Topan").add("Salsa").build();
    stream.forEach(System.out::println);
  }
}
