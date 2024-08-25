package topan_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormatterTest {
  @Test
  public void parse() {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    LocalDate localDate = LocalDate.parse("2002 07 28", dateTimeFormatter);
    System.out.println(localDate);
  }

  @Test
  public void format() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

    LocalDate localDate = LocalDate.parse("2001 09 18", formatter);
    String format = localDate.format(formatter);

    System.out.println(format);
  }

  @Test
  public void defaultFormatter() {
    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    LocalDate localDate = LocalDate.parse("2002-07-28", formatter);
    String format = localDate.format(formatter);

    System.out.println(localDate);
    System.out.println(format);
  }

  @Test
  public void i18n() {
    @SuppressWarnings("deprecation")
    Locale locale = new Locale("in", "ID");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

    LocalDate localDate = LocalDate.of(2002, 7, 28);
    String format = localDate.format(formatter);

    System.out.println(format);
  }
}
