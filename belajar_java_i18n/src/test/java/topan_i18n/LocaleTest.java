package topan_i18n;

import java.util.Locale;

import org.junit.jupiter.api.Test;

public class LocaleTest {

  @Test
  public void testNewLocale() {
    var lang = "id";
    var country = "ID";

    @SuppressWarnings("deprecation")
    var locale = new Locale(lang, country);

    System.out.println(locale.getLanguage());
    System.out.println(locale.getCountry());

    System.out.println(locale.getDisplayLanguage());
    System.out.println(locale.getDisplayCountry());

  }

}
