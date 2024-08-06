package topan_datetime;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

public class TineZoneTest {
  @Test
  public void create() {
    TimeZone defaulTimeZone = TimeZone.getDefault();
    System.out.println(defaulTimeZone);

    TimeZone GMTTimezone = TimeZone.getTimeZone("GNT");
    System.out.println(GMTTimezone);

    String[] timeZoneIds = TimeZone.getAvailableIDs();

    for (String timeZoneId : timeZoneIds) {
      System.out.println(timeZoneId);
    }
  }

  @Test
  public void calendar() {
    Calendar calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
    Calendar calendarUjungPandang = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ujung_Pandang"));

    System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendarUjungPandang.get(Calendar.HOUR_OF_DAY));

    calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
    System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
  }
}
