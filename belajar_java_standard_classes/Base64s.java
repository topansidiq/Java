package belajar_java_standard_classes;

import java.util.Base64;

public class Base64s {
  public static void main(String[] args) {
    String query = "belajar()    pemrograman()   java()";
    String encode = Base64.getEncoder().encodeToString(query.getBytes());
    System.out.println(encode);

    String decode = new String(Base64.getDecoder().decode(encode));
    System.out.println(decode);
  }
}
