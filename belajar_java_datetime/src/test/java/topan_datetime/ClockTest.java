package topan_datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;

import org.junit.jupiter.api.Test;

public class ClockTest {
  @Test
  public void test() {
    Clock clock = Clock.systemDefaultZone();
    System.out.println(clock);
    System.out.println(clock.instant());

    Clock clock2 = Clock.system(ZoneId.of("GMT"));
    System.out.println(clock2.instant());
  }

  @Test
  public void convert() {
    Clock clock = Clock.systemUTC();
    Instant instant = clock.instant();
    LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
    System.out.println(instant);
    System.out.println(localDate);
  }

  @Test
  public void instant() throws InterruptedException {
    Clock clock = Clock.system(ZoneId.of("Asia/Ujung_Pandang"));

    Instant instant = clock.instant();
    System.out.println(instant);

    Thread.sleep(2_000);

    Instant instant2 = clock.instant();
    System.out.println(instant2);
  }

  @Test
  public void fromClock() {
    Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

    Year year = Year.now(clock);
    System.out.println(year);

    YearMonth yearMonth = YearMonth.now(clock);
    MonthDay monthDay = MonthDay.now(clock);
    LocalTime localTime = LocalTime.now(clock);
    LocalDate localDate = LocalDate.now(clock);
    LocalDateTime localDateTime = LocalDateTime.now(clock);
    OffsetTime offsetTime = OffsetTime.now(clock);
    OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);

    System.out.println(yearMonth);
    System.out.println(monthDay);
    System.out.println(localTime);
    System.out.println(localDate);
    System.out.println(localDateTime);
    System.out.println(offsetTime);
    System.out.println(offsetDateTime);

  }
}
