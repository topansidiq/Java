package topan;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import topan.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;

// @DisplayName("Test Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {
  private Calculator calculator = new Calculator();

  @BeforeAll
  public static void beforeAll() {
    System.out.println("Before all");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("After all");
  }

  @BeforeEach
  public void setUp() {
    System.out.println("Before");
  }

  @AfterEach
  public void tearDown() {
    System.out.println("After");
  }

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

  @Test
  public void testAborted() {
    var profile = System.getenv("PROFILE");
    if (!"DEV".equals(profile)) {
      throw new TestAbortedException("Test di batalkan karena bukan dev!");
    }
  }
}
