package topan.thread;

public class SynchronizedCounter {
  private Long value = 0L;

  public synchronized void increment() {
    value++;
  }

  public Long getValue() {
    return value;
  }
}
