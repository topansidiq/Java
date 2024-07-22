package studi_kasus_java.shaper_app;

public class Shape {

  public static void main(String[] args) {
    luas(12);
    Shape.luas(34);
  }

  int panjang;
  int lebar;
  int sisi;

  static void luas(int sisi) {
    System.out.println("Luas persegi adalah " + sisi * sisi);
  }
}
