package topan;

public class Calculator {
  public Integer add(Integer a, Integer b) {
    return a + b;
  }

  public Integer sub(Integer a, Integer b) {
    return a - b;
  }

  public Integer mul(Integer a, Integer b) {
    return a * b;
  }

  public Integer div(Integer a, Integer b) {
    if (b == 0) {
      throw new IllegalArgumentException("Can't divide by zero(0)");
    } else {
      return a / b;
    }
  }
}
