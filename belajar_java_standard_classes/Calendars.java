package belajar_java_standard_classes;

import java.util.Date;
import java.util.Calendar;

public class Calendars {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 0);

    Date result = calendar.getTime();
    System.out.println(result);
  }
}
