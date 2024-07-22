package belajar_java_standard_classes;

import java.util.Objects;

public class ObjectsApp {

  public static class Data {
    private String data;

    public Data(String data) {
      this.data = data;
    }

    public String getData() {
      return data;
    }

    public void setData(String data) {
      this.data = data;
    }

  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "ObjectsApp []";
  }

  public static void main(String[] args) {
    execute(new Data("Topan"));
  }

  public static void execute(Data data) {
    System.out.println(Objects.toString(data));
    System.out.println(Objects.hashCode(data));
  }

}
