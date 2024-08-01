package bank_app.repositories.customers;

import bank_app.entities.Customer;

public interface CustomerRepository {

  void registerCustomer(Customer customer);

  void removeCustomer(String accountNumber);

  void editCustomer(String accountNumber, Customer customer);

  Customer customer(String accountNumber);

  Customer[] getAllcustomer();
}
