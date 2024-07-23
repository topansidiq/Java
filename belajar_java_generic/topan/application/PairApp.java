package topan.application;

import topan.generic.Pair;

public class PairApp {
  public static void main(String[] args) {
    Pair<String, Integer> connection = new Pair<String, Integer>("localhost", 2807);

    System.out.println("Host: " + connection.getFirst());
    System.out.println("Port: " + connection.getSecond());
  }
}
