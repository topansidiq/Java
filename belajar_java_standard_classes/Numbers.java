package belajar_java_standard_classes;

public class Numbers {
  public static void main(String[] args) {

    Integer integerValue = 100;
    Long longValue = integerValue.longValue();
    System.out.println(longValue);
    System.out.println(Long.toHexString(123));
    System.out.println(Integer.toHexString(9090));

    String doubles = "100.100";
    Double contDouble = Double.valueOf(doubles);
    System.out.println(contDouble);

  }
}
