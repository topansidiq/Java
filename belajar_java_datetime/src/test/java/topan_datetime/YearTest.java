package topan_datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

import org.junit.jupiter.api.Test;

public class YearTest {
  @Test
  public void create() {
    Year year1 = Year.now();
    Year year2 = Year.of(2002);
    Year year3 = Year.parse("2002");

    System.out.println(year1);
    System.out.println(year2);
    System.out.println(year3);

    YearMonth yearMonth = YearMonth.now();
    YearMonth yearMonth2 = YearMonth.of(2002, 7);
    YearMonth yearMonth3 = YearMonth.parse("2002-07");

    System.out.println(yearMonth);
    System.out.println(yearMonth2);
    System.out.println(yearMonth3);

    MonthDay monthDay = MonthDay.now();
    MonthDay monthDay2 = MonthDay.of(Month.JULY, 28);
    MonthDay monthDay3 = MonthDay.parse("--07-28");

    System.out.println(monthDay);
    System.out.println(monthDay2);
    System.out.println(monthDay3);
  }

  @Test
  public void name() {
    Year year = Year.now();

    LocalDate localDate = year.atMonth(Month.JULY).atDay(28);

    MonthDay monthDay = MonthDay.from(localDate);

    System.out.println(year);
    System.out.println(localDate);
    System.out.println(monthDay);
  }

  @Test
  public void get() {
    Year year = Year.now();
    YearMonth yearMonth = YearMonth.now();
    MonthDay monthDay = MonthDay.now();

    System.out.println(year.getValue());
    System.out.println(yearMonth.getYear());
    System.out.println(yearMonth.getMonth());
    System.out.println(yearMonth.getMonthValue());
    System.out.println(monthDay.getMonth());
    System.out.println(monthDay.getDayOfMonth());
  }
}
