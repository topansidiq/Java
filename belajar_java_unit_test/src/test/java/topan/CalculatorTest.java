package topan;

import org.junit.jupiter.api.Test;

import topan.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;

// @DisplayName("Test Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {
  private Calculator calculator = new Calculator();

  // @DisplayName("Test Function Add Calculator Success")
  @Test
  public void testAddSuccess() {
    var result = calculator.add(10, 10);
    assertEquals(20, result);
  }

  // @DisplayName("Test Function Div Calculator Success")
  @Test
  public void testDivSuccess() {
    assertEquals(2, calculator.div(10, 5));
  }

  // @DisplayName("Test Function Div Calculator Failed")
  @Test
  public void testDivFailed() {
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.div(10, 0);
    });
  }

  @Test
  @Disabled
  public void testComingSoon() {

  }
}
