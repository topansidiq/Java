package app;

import java.util.function.Predicate;

import util.StringUtil;

public class MethodReferenceApp {
  public static void main(String[] args) {
    MethodReferenceApp methodReferenceApp = new MethodReferenceApp();
    methodReferenceApp.run();
  }

  public void run() {
    Predicate<String> predicateIsLowerCase = new Predicate<String>() {
      @Override
      public boolean test(String value) {
        return StringUtil.isLowerCase(value);
      }
    };

    System.out.println(predicateIsLowerCase.test("Topan Sidiq"));

    Predicate<String> predicateIsEmpty = value -> StringUtil.isEmpty(value);

    System.out.println(predicateIsEmpty.test(""));

    Predicate<String> predicateIsLowerCase2 = StringUtil::isLowerCase;

    System.out.println(predicateIsLowerCase2.test("Topan"));

    Predicate<String> predicateIsEmpty2 = MethodReferenceApp.this::isEmpty;
    Predicate<String> predicateIsEmpty3 = this::isEmpty;

    System.out.println(predicateIsEmpty2.test(null));
    System.out.println(predicateIsEmpty3.test("Topan"));

  }

  public boolean isEmpty(String value) {
    if (value == null || value == "") {
      return true;
    }
    return false;
  }
}
