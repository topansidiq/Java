package topan.thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {
  @Test
  public void mainThread() {
    var name = Thread.currentThread().getName();
    System.out.println(name);
  }

  @Test
  public void createThread() {
    Runnable runnable = () -> {
      System.out.println("Hello from current thread: " + Thread.currentThread().getName());
    };
    runnable.run();
    var thread = new Thread(runnable);
    thread.start();
    var thread2 = new Thread(runnable);
    thread2.start();

    System.out.println("Program finish!");
  }

  @Test
  public void threadSleep() throws InterruptedException {
    Runnable runnable = () -> {
      try {
        Thread.sleep(2000);
        System.out.println("Hello from current thread: " + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    runnable.run();
    var thread = new Thread(runnable);
    thread.start();
    var thread2 = new Thread(runnable);
    thread2.start();

    System.out.println("Program finish!");
    Thread.sleep(3000);
  }

  @Test
  public void threadJoin() throws InterruptedException {
    Runnable runnable = () -> {
      try {
        Thread.sleep(2000);
        System.out.println("Hello from current thread: " + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    var thread = new Thread(runnable);
    thread.start();
    System.out.println("Menunggu selesai...");
    thread.join();
    System.out.println("Program selesai");
  }

  @Test
  public void threadInterrupt() throws InterruptedException {
    Runnable runnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Runnable: " + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    };
    var thread = new Thread(runnable);
    thread.start();
    Thread.sleep(5000);
    thread.interrupt();
    System.out.println("Menunggu selesai");
    thread.join();
    System.out.println("Program selesai");
  }

  @Test
  public void correctThreadInterrupt() throws InterruptedException {
    Runnable runnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Runnable: " + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          return;
        }
      }

    };
    var thread = new Thread(runnable);
    thread.start();
    Thread.sleep(5000);
    thread.interrupt();
    System.out.println("Menunggu selesai");
    thread.join();
    System.out.println("Program selesai");
  }

  @Test
  public void manualThreadInterrupt() throws InterruptedException {
    Runnable runnable = () -> {
      for (int i = 0; i < 10; i++) {
        // Manual Check Interrupted
        if (Thread.interrupted()) {
          return;
        }
        System.out.println("Runnable: " + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          return;
        }
      }

    };
    var thread = new Thread(runnable);
    thread.start();
    Thread.sleep(5000);
    thread.interrupt();
    System.out.println("Menunggu selesai");
    thread.join();
    System.out.println("Program selesai");
  }

  @Test
  public void threadName() {
    var thread = new Thread(() -> {
      System.out.println("Run in thread " + Thread.currentThread().getName());
    });
    thread.setName("topan");
    thread.start();
  }

  @Test
  public void threadState() throws InterruptedException {
    var thread = new Thread(() -> {
      System.out.println(Thread.currentThread().getState());
      System.out.println("Run in thread " + Thread.currentThread().getName());
    });
    thread.setName("topan");
    System.out.println(thread.getState());

    thread.start();
    thread.join();
    System.out.println(thread.getState());
  }
}
