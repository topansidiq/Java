package topan_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;

public class OffsetTimeTest {
  @Test
  public void create() {
    OffsetTime offsetTime = OffsetTime.now();
    OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
    OffsetTime offsetTime3 = OffsetTime.of(23, 59, 59, 100, ZoneOffset.ofHours(7));
    OffsetTime offsetTime4 = OffsetTime.parse("23:59:59.100+05:00");

    System.out.println(offsetTime);
    System.out.println(offsetTime2);
    System.out.println(offsetTime3);
    System.out.println(offsetTime4);

    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.of("GMT"));
    OffsetDateTime offsetDateTime3 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(6));
    OffsetDateTime offsetDateTime4 = OffsetDateTime.parse("2002-07-28T23:59:59.100-07:45");

    System.out.println(offsetDateTime);
    System.out.println(offsetDateTime2);
    System.out.println(offsetDateTime3);
    System.out.println(offsetDateTime4);
  }

  @Test
  public void convert() {
    LocalTime localTime = LocalTime.now();
    OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(5));
    LocalTime localTime2 = offsetTime.toLocalTime();

    System.out.println(localTime);
    System.out.println(offsetTime);
    System.out.println(localTime2);

    LocalDateTime localDateTime = LocalDateTime.now();
    OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
    LocalDateTime localDateTime2 = offsetDateTime.toLocalDateTime();
    LocalDate localDate = offsetDateTime.toLocalDate();
    LocalTime localTime3 = offsetDateTime.toLocalTime();

    System.out.println(localDateTime);
    System.out.println(offsetDateTime);
    System.out.println(localDateTime2);
    System.out.println(localDate);
    System.out.println(localTime3);
  }
}
