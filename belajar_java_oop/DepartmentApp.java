package belajar_java_oop;

public class DepartmentApp {
  public static void main(String[] args) {
    // Membuat object baru
    Department english = new Department("Bahasa Inggris", "Sosial");

    // Merubah data dari field
    english.type = "Soshum";

    // Mengakses data di field
    System.out.println(english.name);

    // Menggunakan method dari object
    english.getDepartmentData();
  }
}
