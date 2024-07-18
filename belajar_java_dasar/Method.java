public class Method {
  public static void main(String[] args) {
    showData();
    showData2("Topan Sidiq", 22);
    System.out.println(penjumlahan(20, 12));

    int[] values = { 90, 80, 99, 91, 88 };
    lulus("Topan Sidiq", values);
    lulus2("Topan", 90, 80, 91, 98, 89, 70);
  }

  /// Standard Method
  static void showData() {
    System.out.println("Hello!");
  }

  /// Method with Parameter
  static void showData2(String name, int age) {
    System.out.println("Hello " + name + ". You are " + age + " years old!");
  }

  /// Method with Return Value
  static int penjumlahan(int a, int b) {
    return a + b;
  }

  /// Methid with Array Parameter
  static void lulus(String name, int[] values) {
    var total = 0;
    for (int value : values) {
      total += value;
    }

    var modus = total / values.length;

    System.out.println(
        "Hai " + name +
            ". Total nilai anda adalah " + total +
            " dengan rata-rata " + modus +
            ". Selamat anda lulus!");
  }

  /// Method with Variable Argument
  static void lulus2(String name, int... values) {
    var total = 0;
    for (int value : values) {
      total += value;
    }

    var modus = total / values.length;

    System.out.println(
        "Hai " + name +
            ". Total nilai anda adalah " + total +
            " dengan rata-rata " + modus +
            ". Selamat anda lulus!");
  }
}
