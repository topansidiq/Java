package topan_datetime;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class CalendarTest {
  @Test
  public void testCreate() {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar);

    Date date = calendar.getTime();
    System.out.println(date);
  }

  @Test
  public void modifierCalendar() {
    Calendar calendar = Calendar.getInstance();

    calendar.set(Calendar.YEAR, 2002);
    calendar.set(Calendar.MONTH, Calendar.JULY);
    calendar.set(Calendar.DAY_OF_MONTH, 28);
    calendar.set(Calendar.HOUR_OF_DAY, 23);
    calendar.set(Calendar.MINUTE, 59);
    calendar.set(Calendar.SECOND, 59);
    calendar.set(Calendar.MILLISECOND, 100);

    Date date = calendar.getTime();
    System.out.println(date);
    System.out.println(date.getTime());
  }

  @Test
  public void getCalendar() {
    Calendar calendar = Calendar.getInstance();

    System.out.println(calendar.get(Calendar.YEAR));
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.get(Calendar.DATE));
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    System.out.println(calendar.get(Calendar.HOUR));
    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendar.get(Calendar.MILLISECOND));
    System.out.println(calendar.get(Calendar.MINUTE));
    System.out.println(calendar.get(Calendar.SECOND));
  }
}
