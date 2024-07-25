package app;

import java.util.function.Consumer;

public class ConsumerApp {

  public static void main(String[] args) {

    // Your code
    Consumer<String> consumer = value -> System.out.println(value);
    consumer.accept("Topan");

  }

}
