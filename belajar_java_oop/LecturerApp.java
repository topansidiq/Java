package belajar_java_oop;

public class LecturerApp {
  public static void main(String[] args) {
    Lecturer lecture001 = new Lecturer();
    lecture001.name = "Topan Sidiq";
    lecture001.setSubjects("Public Speaking 1", "Public Speaking 2", "Speaking 1", "Speaking 2");
    lecture001.PAClass = "2A D3 Bahasa Inggris";
    lecture001.NIP = "00922013848280702";
    lecture001.getLectureData();
    System.out.println(lecture001.getPAStatus());
  }
}
