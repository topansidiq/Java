package topan.generic;

public class Data<GenericType> {

  private GenericType data;

  public Data(GenericType data) {
    this.data = data;
  }

  public GenericType getData() {
    return data;
  }

  public void setData(GenericType data) {
    this.data = data;
  }

}