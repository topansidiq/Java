package topan.application;

import topan.application.MultipleConstraintApp.Data;

public class WildcardApp {
  public static void main(String[] args) {
    print(new Data<>(null));
  }

  public static void print(Data<?> data) {
    System.out.println(data.getData());
  }
}
