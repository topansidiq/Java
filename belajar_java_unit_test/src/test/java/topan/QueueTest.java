package topan;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Queue test")
public class QueueTest {
  private Queue<String> queue;

  @Nested
  @DisplayName("when new")
  public class WhenNew {
    @BeforeEach
    void setUp() {
      queue = new LinkedList<>();
    }

    @Test
    @DisplayName("when offer, size must be 1")
    void name() {
      queue.offer("Topan");
      Assertions.assertEquals(1, queue.size());
    }

    @Test
    @DisplayName("when offer, size must be 2")
    void name2Data() {
      queue.offer("Topan");
      queue.offer("Topan");
      Assertions.assertEquals(2, queue.size());
    }
  }
}
