package bank_app.entities;

import java.sql.Date;

public class Customer {

  private String accountNumber;
  private String name;
  private String phoneNumber;
  private Date dateJoin;
  private String accountType;

  public Customer(String accountNumber, String name, String phoneNumber, Date dateJoin, String accountType) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.dateJoin = dateJoin;
    this.accountType = accountType;
  }

  public Customer(String accountNumber, String name, String phoneNumber, String accountType) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.accountType = accountType;
  }

  public Customer() {
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Date getDateJoin() {
    return dateJoin;
  }

  public void setDateJoin(Date dateJoin) {
    this.dateJoin = dateJoin;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

}
