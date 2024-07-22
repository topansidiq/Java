package belajar_java_standard_classes;

public class StringBuilders {
  public static void main(String[] args) {
    StringBuilder sBuilder = new StringBuilder();
    sBuilder.append("Topan");
    sBuilder.append(" Sidiq");
    System.out.println(sBuilder.capacity());
    System.out.println(sBuilder);
  }
}
