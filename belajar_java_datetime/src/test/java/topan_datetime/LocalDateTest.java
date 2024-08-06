package topan_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class LocalDateTest {
  @Test
  public void create() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(2002, Month.JULY, 28);

    System.out.println(localDate);
    System.out.println(localDate2);
    System.out.println(LocalDate.parse("2002-07-28"));
  }

  @Test
  public void with() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate2 = localDate.withYear(2002).withDayOfMonth(28);
    LocalDate localDate3 = localDate2.withYear(2024).withMonth(8);

    System.out.println(localDate);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }

  @Test
  public void manipulation() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate2 = localDate.minusYears(22);
    LocalDate localDate3 = localDate.minusDays(365);

    System.out.println(localDate);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }

  @Test
  public void getDateData() {
    LocalDate localDate = LocalDate.now();
    int year = localDate.getYear();
    Month month = localDate.getMonth();
    int monthValue = localDate.getMonthValue();
    int dayOfMonth = localDate.getDayOfMonth();
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    int dayOfYear = localDate.getDayOfYear();

    System.out.println(localDate);
    System.out.println(year);
    System.out.println(month);
    System.out.println(monthValue);
    System.out.println(dayOfMonth);
    System.out.println(dayOfWeek);
    System.out.println(dayOfYear);
  }
}
