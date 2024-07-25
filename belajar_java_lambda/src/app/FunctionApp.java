package app;

import java.util.function.Function;

public class FunctionApp {
  public static void main(String[] args) {

    // Tanpa lambda
    Function<String, Integer> functionLength = new Function<String, Integer>() {
      @Override
      public Integer apply(String value) {
        return value.length();
      }
    };

    System.out.println(functionLength.apply("Topan"));

    // Menggunakan lambda
    Function<String, Integer> functionLength2 = value -> value.length();

    System.out.println(functionLength2.apply("Sidiq"));

  }
}
