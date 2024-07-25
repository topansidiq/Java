package topan.maven;

public class Person {

  String name;

  String[] hobbies;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person(String name) {
    this.name = name;
  }

  public String[] getHobbies() {
    return hobbies;
  }

  public void setHobbies(String... hobbies) {
    this.hobbies = hobbies;
  }

}
