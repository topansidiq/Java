package topan_datetime;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

public class PeriodTest {
  @Test
  public void create() {
    Period period = Period.ofDays(10);
    Period period2 = Period.ofWeeks(5);
    Period period3 = Period.ofMonths(10);
    Period period4 = Period.ofYears(9);
    Period period5 = Period.of(3, 9, 12);

    System.out.println(period);
    System.out.println(period2);
    System.out.println(period3);
    System.out.println(period4);
    System.out.println(period5);
  }

  @Test
  public void get() {
    Period period = Period.of(10, 9, 8);

    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
  }

  @Test
  public void count() {
    Period period = Period.between(LocalDate.of(2002, 7, 28), LocalDate.now());
    System.out.println(period.getYears());
    System.out.println(period.getChronology());
  }
}
