package topan.application;

import topan.generic.Data;

public class GenericClassApp {
  public static void main(String[] args) {
    Data<String> stringData = new Data<String>("topanisme");
    Data<Integer> integerData = new Data<Integer>(22);

    System.out.println(stringData.getData());
    System.out.println(integerData.getData());
  }
}
