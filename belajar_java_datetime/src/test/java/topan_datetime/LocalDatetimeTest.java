package topan_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class LocalDatetimeTest {
  @Test
  public void create() {
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTime2 = LocalDateTime.of(2002, 7, 28, 23, 59, 59);
    LocalDateTime localDateTime3 = LocalDateTime.parse("2002-07-28T23:59:59.999");

    System.out.println(localDateTime);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }

  @Test
  public void with() {
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTime2 = localDateTime.withYear(2002);
    LocalDateTime localDateTime3 = localDateTime.withHour(23);

    System.out.println(localDateTime);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }

  @Test
  public void modify() {
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTime2 = localDateTime.minusMonths(540);
    LocalDateTime localDateTime3 = localDateTime.plusWeeks(700).plusDays(300);

    System.out.println(localDateTime);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }

  @Test
  public void get() {
    LocalDateTime localDateTime = LocalDateTime.now();

    int year = localDateTime.getYear();
    int hour = localDateTime.getHour();

    System.out.println(year);
    System.out.println(hour);
  }

  @Test
  public void date() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalDate localDate = localDateTime.toLocalDate();
    System.out.println(localDate);

    LocalDateTime result = localDate.atTime(23, 59, 59, 100);
    System.out.println(result);
  }

  @Test
  public void time() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalTime localTime = localDateTime.toLocalTime();
    System.out.println(localTime);

    LocalDateTime localDateTime2 = localTime.atDate(LocalDate.now());
    System.out.println(localDateTime2);
  }
}
