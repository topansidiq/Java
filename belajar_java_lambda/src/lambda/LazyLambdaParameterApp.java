package lambda;

import java.util.function.Supplier;

public class LazyLambdaParameterApp {

  public static void main(String[] args) {
    testScore(90, () -> getName());
  }

  public static void testScore(int value, Supplier<String> name) {
    if (value > 80) {
      System.out.println("Selamat " + name.get() + ", anda lulus!");
    } else {
      System.out.println("Coba lagi tahun depan!");
    }
  }

  public static String getName() {
    System.out.println("Method getName() dipanggil.");
    return "Topan Sidiq";
  }

}
