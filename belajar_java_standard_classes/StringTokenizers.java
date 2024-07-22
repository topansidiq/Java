package belajar_java_standard_classes;

import java.util.StringTokenizer;

public class StringTokenizers {
  public static void main(String[] args) {
    StringTokenizer sTokenizer = new StringTokenizer("Topan Sidiq", " ");

    System.out.println(sTokenizer.countTokens());

    while (sTokenizer.hasMoreTokens()) {
      String token = sTokenizer.nextToken();
      System.out.println(token);
    }
  }
}
