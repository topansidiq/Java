package belajar_java_oop;

// Inheritance
class ProgramStudy extends Department {
  // Child Field
  String name;
  protected String department;

  void getDataProgramStudy() {
    // Super untuk akses parent field/method
    System.out.println("Name\t\t: " + super.name);
    System.out.println("Department\t: " + this.department);
  }

  // Mengakses constructor parent
  ProgramStudy() {
    super(null);
  }
}
