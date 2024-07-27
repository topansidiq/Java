package topan.repository;

import topan.data.Person;

public interface PersonRepository {
  Person selectById(String id);

  void insert(Person person);
}
