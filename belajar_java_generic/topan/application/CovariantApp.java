package topan.application;

import topan.generic.Data;

public class CovariantApp {
  public static void main(String[] args) {
    Data<String> data = new Data<>("1000");
    process(data);
  }

  public static void process(Data<? extends Object> data) {
    System.out.println(data.getData());
    // data.setData(1); // Error, tidak bisa merubah data, hanya membaca data
  }
}
