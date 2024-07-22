package belajar_java_oop;

class Department {
  // Fields/Attributes
  String name;
  String type;

  // Methods/Functions
  void getDepartmentData() {
    System.out.println("Name\t: " + this.name);
    System.out.println("Type\t: " + this.type);
  }

  // Constructors
  Department(String paramName, String paramType) {
    name = paramName;
    this.type = paramType;
  }

  Department(String paramName) {
    this(paramName, null);
  }

  Department() {
    this(null);
  }
}
