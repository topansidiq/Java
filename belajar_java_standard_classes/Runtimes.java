package belajar_java_standard_classes;

public class Runtimes {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    System.out.println(runtime.availableProcessors());
    System.out.println(runtime.freeMemory());
    System.out.println(runtime.maxMemory());
    System.out.println(runtime.totalMemory());
    System.out.println(Runtime.version());
  }
}
