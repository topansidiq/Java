package topan_datetime;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class LocalTimeTest {
  @Test
  public void create() {
    LocalTime localTime = LocalTime.now();
    LocalTime localTime2 = LocalTime.of(23, 23, 59);
    LocalTime localTime3 = LocalTime.parse("23:59:59");

    System.out.println(localTime);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }

  @Test
  public void with() {
    LocalTime localTime = LocalTime.now();
    LocalTime localTime2 = localTime.withHour(23);
    LocalTime localTime3 = localTime.withHour(23).withSecond(59).withMinute(59);

    System.out.println(localTime);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }

  @Test
  public void modify() {
    LocalTime localTime = LocalTime.now();
    LocalTime localTime2 = localTime.plusHours(23);
    LocalTime localTime3 = localTime.plusHours(23).minusMinutes(59).plusSeconds(59);

    System.out.println(localTime);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }
}
