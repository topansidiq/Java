package topan.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ForEachOperationTest {
  @Test
  public void testPeekBefore() {
    List.of("Topan", "Sidiq", "Salsa").stream()
        .map(name -> {
          System.out.println("Before Name to Upper: " + name);
          String upper = name.toUpperCase();
          System.out.println("Change Name to Upper: " + upper);
          return upper;
        })
        .forEach(name -> System.out.println("Final Name: " + name));
  }

  @Test
  public void testPeekAfter() {
    List.of("Topan", "Sidiq", "Salsa").stream()
        .peek(name -> System.out.println("Before change name to upper: " + name))
        .map(name -> name.toUpperCase())
        .peek(upper -> System.out.println("Change name to upper: " + upper))
        .forEach(name -> System.out.println("Final Name: " + name));
  }
}
