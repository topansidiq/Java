package topan.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamPipelineTest {
  @Test
  public void testCreateStreamPipeline() {
    List.of("Topan", "Sidiq", "Salsa")
        .stream()
        .map(name -> name.toUpperCase())
        .map(upper -> "- " + upper)
        .forEach(System.out::println);
  }
}
