package belajar_java_standard_classes;

import java.util.regex.Pattern;

public class RegularExpression {
  public static void main(String[] args) {
    String email = "topansidiq7@gmail.com";
    Pattern pattern = Pattern.compile("[a-z0-9]*[@][]");
  }
}
