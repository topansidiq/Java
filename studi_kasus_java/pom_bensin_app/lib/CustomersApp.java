package studi_kasus_java.pom_bensin_app.lib;

public class CustomersApp extends Customers {

  public CustomersApp(int iD) {
    super(iD);
  }

  static void addCustomer(int id, String name, String address, long phoneNumber) {
    Customers customer = new Customers(id, name, address, phoneNumber);
  }

  static void addCustomer(int id, String name, String address) {
    Customers customer = new Customers(id, name, address);
  }

  static void addCustomer(int id, String name) {
    Customers customer = new Customers(id, name);
  }

  static void addCustomer(int id) {
    Customers customer = new Customers(id);
  }

  static void editCustomer() {
  }

  static void removeCustomer() {
  }
}

public class Customers {

  int ID;
  String name;
  String address;
  long phoneNumber;

  // GetSet
  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // Constructor
  public Customers(int iD, String name, String address, long phoneNumber) {
    ID = iD;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public Customers(int iD, String name, String address) {
    ID = iD;
    this.name = name;
    this.address = address;
  }

  public Customers(int iD, String name, long phoneNumber) {
    ID = iD;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public Customers(int iD, String name) {
    ID = iD;
    this.name = name;
  }

  public Customers(int iD) {
    ID = iD;
  }

  @Override
  public String toString() {
    return "Customer [ID=" + ID + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
  }

}
