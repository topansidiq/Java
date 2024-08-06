package topan_datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class ZoneDateTimeTest {
  @Test
  public void create() {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Ujung_Pandang"));
    ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("GMT"));
    ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(5));

    System.out.println(zonedDateTime);
    System.out.println(zonedDateTime2);
    System.out.println(zonedDateTime3);
    System.out.println(zonedDateTime4);
  }

  @Test
  public void parse() {
    ZonedDateTime zonedDateTime = ZonedDateTime.parse("2024-08-06T16:31:07.839807400+07:00[Asia/Jakarta]");
    System.out.println(zonedDateTime.getDayOfMonth());
    System.out.println(zonedDateTime.getDayOfWeek());
  }

  @Test
  public void changeZoneId() {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);

    ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameLocal(ZoneId.of("GMT"));
    ZonedDateTime zonedDateTime3 = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Jakarta"));

    System.out.println(zonedDateTime2);
    System.out.println(zonedDateTime3);
  }
}
