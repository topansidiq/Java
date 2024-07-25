package app;

import lambda.SimpleAction;

public class SimpleActionApp {
  public static void main(String[] args) {
    // SimpleAction simpleAction1 = new SimpleAction() {
    // @Override
    // public String action() {
    // return "Topan";
    // }
    // };

    // System.out.println(simpleAction1.action());

    // SimpleAction simpleAction2 = () -> {
    // return "Topan";
    // };

    // System.out.println(simpleAction2.action());

    SimpleAction simpleAction1 = (String name) -> ("Hello " + name);

    SimpleAction simpleAction2 = (name) -> {
      return "Hai " + name;
    };

    SimpleAction simpleAction3 = (String name) -> "Hei " + name;

    SimpleAction simpleAction4 = (name) -> "Ohayo " + name;

    SimpleAction simpleAction5 = name -> "Hola " + name;

    System.out.println(simpleAction1.action("Topan"));
    System.out.println(simpleAction2.action("Sidiq"));
    System.out.println(simpleAction3.action("Sidiq"));
    System.out.println(simpleAction4.action("Sidiq"));
    System.out.println(simpleAction5.action("Sidiq"));

  }
}
