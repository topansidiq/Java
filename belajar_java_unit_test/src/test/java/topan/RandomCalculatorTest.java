package topan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import topan.resolver.RandomParameterResolver;

@Extensions({
    @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest {
  private Calculator calculator = new Calculator();

  @Test
  void testRandom(Random random) {
    var a = random.nextInt();
    var b = random.nextInt();
    var result = calculator.add(a, b);
    int expected = a + b;
    Assertions.assertEquals(expected, result);
    
  }

  @DisplayName("Test random calculator")
  @RepeatedTest(value = 10, name = "{displayName}")
  public void testRandomRepeatInfo(TestInfo info, Random random, RepetitionInfo repetitionInfo){
    System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
    var a = random.nextInt();
    var b = random.nextInt();
    var result = calculator.add(a, b);
    var expected = a + b;
    assertEquals(expected, result);
  }

  public static List<Integer> parameterSource(){
    return List.of(1, 2, 3, 4, 90);
  }

  @DisplayName("Test calculator with parameter")
  @ParameterizedTest(name = "{displayName} with data {0}")
  @MethodSource({"parameterSource"})
  public void testWithParameter(Integer value){
    var expected = value + value;
    var result = calculator.add(value, value);
    Assertions.assertEquals(expected, result);
  }
}
