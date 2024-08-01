package topan_i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTest {
  @Test
  public void testMessageFormat() {
    String message = "Hai {0}, selamat datang di aplikasi {1}";
    MessageFormat messageFormat = new MessageFormat(message);
    String format = messageFormat.format(new Object[] { "Topan", "Kiko, Mah Minta KiKO" });
    System.out.println(format);

    int a = 10;
    int b = -100;
    int c = a + b;

    String message2 = new MessageFormat("{0} + {1} = {2}").format(new Object[] { a, b, c });
    System.out.println(message2);
  }

  @Test
  public void testMessageFormatWithResourceBundle() {
    @SuppressWarnings("deprecation")
    Locale ind = new Locale("in", "ID");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", ind);
    String pattern = resourceBundle.getString("welcome.message");

    MessageFormat messageFormat = new MessageFormat(pattern);
    String format = messageFormat.format(new Object[] { "Topan", "Kiko, Mah Minta KiKO" });
    System.out.println(format);
  }
}
