package topan_datetime;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class DateTest {
  @Test
  public void testCreate() {
    var date1 = new Date();
    var date2 = new Date(System.currentTimeMillis());
    var date3 = new Date(345334500000L);

    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);
  }
}
