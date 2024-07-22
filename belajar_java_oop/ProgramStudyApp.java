package belajar_java_oop;

public class ProgramStudyApp {
  public static void main(String[] args) {
    // Membuat object baru dari child class
    ProgramStudy d3English = new ProgramStudy();

    // Merubah data field
    d3English.name = "D3 Bahasa Inggris";
    d3English.department = "Bahasa Inggris";

    // Mengakses data field
    System.out.println(d3English.department);

    // Mengakses method parent dari object child
    d3English.getDataProgramStudy();
  }
}
