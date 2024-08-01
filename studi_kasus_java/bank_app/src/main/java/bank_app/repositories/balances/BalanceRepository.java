package bank_app.repositories.balances;

import bank_app.entities.Customer;

public interface BalanceRepository {

  void getBalance(Customer customer);

  void getCredit(Customer customer);

  void addBalance(Integer amount);

  void addCredit(Integer amount);

  void cutBalance(Integer amount);

  void cutCredit(Integer amount);

}