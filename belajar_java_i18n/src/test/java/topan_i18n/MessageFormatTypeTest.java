package topan_i18n;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTypeTest {
  @Test
  public void testMessageFormatWithResourceBundle() {
    @SuppressWarnings("deprecation")
    Locale ind = new Locale("in", "ID");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", ind);
    String pattern = resourceBundle.getString("status");

    MessageFormat messageFormat = new MessageFormat(pattern, ind);
    String format = messageFormat.format(new Object[] { "Topan", new Date(), 34900876 });
    System.out.println(format);
  }
}
