package topan.application;

public class MultipleConstraintApp {
  public static void main(String[] args) {
    Data<Manager> managerData = new Data<>(new Manager());
    Data<VP> vpData = new Data<>(new VP());

    System.out.println(managerData.getData());
    System.out.println(vpData.getData());

  }

  public static class Data<T extends Employee & CanSayHello> {
    private T data;

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }

    public Data(T data) {
      this.data = data;
    }

  }

  public static abstract class Employee {

  }

  public static class Manager extends Employee implements CanSayHello {

    @Override
    public void sayHello(String name) {

    }

  }

  public static class VP extends Employee implements CanSayHello {

    @Override
    public void sayHello(String name) {

      System.out.println("Hello " + name);

    }

  }

  public static interface CanSayHello {

    void sayHello(String name);
  }
}
