package topan_datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class DurationTest {
  @Test
  public void create() {
    Duration duration = Duration.ofHours(10);
    Duration duration2 = Duration.ofMinutes(10);
    Duration duration3 = Duration.ofSeconds(10);

    System.out.println(duration);
    System.out.println(duration2);
    System.out.println(duration3);
  }

  @Test
  public void get() {
    Duration duration = Duration.ofHours(10);

    System.out.println(duration.toDays());
    System.out.println(duration.toMinutes());
  }

  @Test
  public void count() {
    Duration duration = Duration.between(LocalTime.of(1, 40, 56), LocalTime.of(8, 29, 10));
    Duration duration2 = Duration.between(LocalTime.now(), LocalTime.now().plusHours(90));
    System.out.println(duration);
    System.out.println(duration2);
    System.out.println(duration2.toDays());

    Duration duration3 = Duration.between(LocalDateTime.now().plusHours(10), LocalDateTime.now());
    System.out.println(duration3.toHours());
    System.out.println(duration3.toMinutes());
  }
}
