package topan.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CheckOperationTest {
  @Test
  public void testAnyMatch() {
    boolean match = List.of(23, 42, 55, 60, 12, 90, 87, 21, 56, 78).stream()
        .anyMatch(number -> number > 80);
    System.out.println(match);
  }

  @Test
  public void testAllMatch() {
    boolean match = List.of(23, 42, 55, 60, 12, 90, 87, 21, 56, 78).stream()
        .allMatch(number -> number > 80);
    System.out.println(match);
  }

  @Test
  public void testNoneMatch() {
    boolean match = List.of(23, 42, 55, 60, 12, 90, 87, 21, 56, 78).stream()
        .noneMatch(number -> number > 90);
    System.out.println(match);
  }
}
