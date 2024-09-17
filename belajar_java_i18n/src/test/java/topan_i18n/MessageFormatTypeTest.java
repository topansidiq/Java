package topan_i18n;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class MessageFormatTypeTest {
  public static void main(String[] args) {
    testMessageFormatWithResourceBundle();
  }

  @Test
  public static void testMessageFormatWithResourceBundle() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Pilih bahasa: ");
      String bahasa = scanner.next();
      System.out.print("Pilih bahasa: ");
      String negara = scanner.next();
      @SuppressWarnings("deprecation")
      Locale ind = new Locale(bahasa, negara);
      ResourceBundle resourceBundle = ResourceBundle.getBundle("message", ind);
      String pattern = resourceBundle.getString("status");

      MessageFormat messageFormat = new MessageFormat(pattern, ind);
      String format = messageFormat.format(new Object[] { "Topan", new Date(), 34900876 });
      System.out.println(format);
    }
    System.out.println();
  }
}
