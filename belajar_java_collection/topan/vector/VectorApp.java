package topan.vector;

import java.util.Vector;

public class VectorApp {

  public static void main(String[] args) {
    Vector<String> vector = new Vector<>();

    vector.add("Topan Sidiq");

    System.out.println(vector.firstElement());
  }
}
