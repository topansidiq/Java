package topan;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  public void slow1() throws InterruptedException {
    Thread.sleep(4000);
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  public void slow2() throws InterruptedException {
    Thread.sleep(4000);
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  public void slow3() throws InterruptedException {
    Thread.sleep(4000);
  }
}
