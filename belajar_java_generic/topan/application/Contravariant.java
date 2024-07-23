package topan.application;

import topan.generic.Data;

public class Contravariant {
  public static void main(String[] args) {
    Data<Object> objectData = new Data<>("Topan");
    Data<? super String> data = objectData;
    System.out.println(data.getData());

    process(data);
  }

  public static void process(Data<? super String> data) {
    String value = (String) data.getData();
    System.out.println("Process parameter: " + value);
    data.setData("Topan Sidiq");
  }
}
