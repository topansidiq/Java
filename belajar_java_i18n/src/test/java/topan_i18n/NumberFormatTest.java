package topan_i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class NumberFormatTest {
  @Test
  public void testNumberFormat() {
    @SuppressWarnings("deprecation")
    var indonesia = new Locale("in", "ID");
    var numberFormat = NumberFormat.getInstance();
    var numberFormatLocal = NumberFormat.getInstance(indonesia);
    var format = numberFormat.format(1000000.255);
    var formatLocale = numberFormatLocal.format(1000000.229);
    System.out.println("International: " + format);
    System.out.println("Locale: " + formatLocale);
  }

  @Test
  public void testNumberFormatParse() throws ParseException {
    @SuppressWarnings("deprecation")
    var indonesia = new Locale("in", "ID");
    var numberFormatLocal = NumberFormat.getInstance(indonesia);

    double number = numberFormatLocal.parse("10.000.000,889").doubleValue();
    System.out.println(number);
  }
}
