package belajar_java_oop;

public class CarApp {
  public static void main(String[] args) {
    Car car = new Avanza();
    System.out.println(car.getTire());
    car.drive();

    // Anonymous class
    Car car2 = new Car() {
      Boolean isBig = false;

      public int getTire() {
        return 0;
      }

      public void drive() {

      }

      public Boolean isBig() {
        return isBig;
      }
    };

    System.out.println(car2.isBig());
    car2.drive();

  }
}
