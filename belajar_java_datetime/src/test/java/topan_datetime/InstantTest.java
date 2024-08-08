package topan_datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;

public class InstantTest {
  @Test
  public void create() {
    Instant instant = Instant.now();
    System.out.println(instant);
    System.out.println(instant.getEpochSecond());
    System.out.println(instant.toEpochMilli());

    Instant instant2 = Instant.ofEpochMilli(0);
    System.out.println(instant2);
  }

  @Test
  public void modify() {
    Instant instant = Instant.now();
    Instant instant2 = instant.plusMillis(10000000);
    Instant instant3 = instant.minusSeconds(90000);

    System.out.println(instant.getEpochSecond());
    System.out.println(instant2.getEpochSecond());
    System.out.println(instant3.getEpochSecond());
  }

  @Test
  public void get() {
    Instant instant = Instant.now();
    System.out.println(instant.toEpochMilli());
    System.out.println(instant.getEpochSecond());
    System.out.println(instant.getNano());
  }

  @Test
  public void convert() {
    Instant instant = Instant.now();
    LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
    LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.of("GMT"));
    System.out.println(instant);
    System.out.println(localDate);
    System.out.println(localTime);

    Instant instant2 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(3));
    System.out.println(instant2);
  }
}
