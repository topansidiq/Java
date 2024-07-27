package topan;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

  private int counter = 0;

  @Test
  @Order(1)
  public void test1() {
    counter--;
    System.out.println(counter);
  }

  @Test
  @Order(3)
  public void test2() {
    counter++;
    System.out.println(counter);
  }

  @Test
  @Order(2)
  public void test3() {
    counter += counter / 2;
    System.out.println(counter);
  }
}
