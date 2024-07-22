package belajar_java_oop;

import java.util.Arrays;

class Lecturer extends Department {
  String NIP;
  private String[] subjects;
  String PAClass;
  private Boolean isPA = false;

  Boolean getPAStatus() {
    if (PAClass != null) {
      isPA = true;
    }

    return isPA;
  }

  String[] setSubjects(String... subjects) {
    this.subjects = subjects;
    return subjects;
  }

  String getPACLassName() {
    if (isPA) {
      return PAClass;
    }
    return "-";
  }

  void getLectureData() {
    System.out.println("Name\t: " + name);
    System.out.println("NIP\t: " + NIP);
    System.out.println("PA\t: " + PAClass);
    System.out.println("Subject\t: ");
    for (String subject : subjects) {
      System.out.println(" - " + subject);
    }
  }

  @Override
  public String toString() {
    return "Lecturer [NIP=" + NIP + ", subjects=" + Arrays.toString(subjects) + ", PAClass=" + PAClass + ", isPA="
        + isPA + "]";
  }

}
