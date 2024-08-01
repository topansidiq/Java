package topan_i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormatterTest {
  @Test
  public void testDateFormatter() {
    // System.out.println(new Date().toString());
    // var pattern = "EEEE dd MMMM YYYY";
    // var locale = new Locale("in", "ID");
    // System.out.println(new SimpleDateFormat(pattern, locale).format(new Date()));
  }

  @Test
  public void testLocaleDateFormate() {
    var pattern = "EEEE, dd MMMM yyyy";
    @SuppressWarnings("deprecation")
    var indonesia = new Locale("in", "ID");
    var dateFormat = new SimpleDateFormat(pattern, indonesia);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  public void testDateFormatParse() throws ParseException {
    var pattern = "EEEE, dd MMMM yyyy";
    @SuppressWarnings("deprecation")
    var indonesia = new Locale("in", "ID");
    var dateFormat = new SimpleDateFormat(pattern, indonesia);

    var date = dateFormat.parse("Kamis, 01 Agustus 2024");

    var format = dateFormat.format(new Date());
    System.out.println(format);
    System.out.println(date);
  }
}
