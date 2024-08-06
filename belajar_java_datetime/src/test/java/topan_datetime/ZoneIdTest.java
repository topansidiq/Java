package topan_datetime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ZoneIdTest {
  @Test
  public void create() {
    ZoneId zoneId = ZoneId.systemDefault();
    ZoneId zoneIdGMT = ZoneId.of("GMT");

    System.out.println(zoneId);
    System.out.println(zoneIdGMT);

    Set<String> set = ZoneId.getAvailableZoneIds();
    set.forEach(System.out::println);
    ZoneId.SHORT_IDS.forEach((key, value) -> {
      System.out.println(key + " - " + value);
    });
  }

  @Test
  public void createZoneOfSet() {
    ZoneOffset zoneOffset = ZoneOffset.of("+09:00");
    ZoneOffset zoneOffset2 = ZoneOffset.ofHours(3);
    ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(9, 20);

    System.out.println(zoneOffset);
    System.out.println(zoneOffset2);
    System.out.println(zoneOffset3);
  }
}
