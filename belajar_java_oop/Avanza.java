package belajar_java_oop;

public class Avanza implements Car {
  @Override
  public void drive() {
    System.out.println("Avanza drive!");
  }

  @Override
  public int getTire() {
    return 4;
  }

  @Override
  public Boolean isBig() {
    return false;
  }
}
