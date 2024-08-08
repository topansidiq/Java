package topan_datetime;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class DurationTest {
  @Test
  public void create() {
    Duration duration = Duration.ofSeconds(6000);
    System.out.println(duration);
  }
}
