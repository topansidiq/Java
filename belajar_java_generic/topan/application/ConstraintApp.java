package topan.application;

public class ConstraintApp {
  public static void main(String[] args) {
    NumberData<Integer> integerNumberData = new NumberData<Integer>(1000);
    NumberData<Long> longNumberData = new NumberData<Long>(19999999L);

    System.out.println(integerNumberData.getData());
    System.out.println(longNumberData.equals(longNumberData));
  }

  public static class NumberData<T extends Number> {

    private T data;

    public NumberData(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }

  }
}
