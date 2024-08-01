package topan_i18n;

import java.util.Currency;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class CurrencyTest {
  @Test
  public void testCurrencyIDN() {
    @SuppressWarnings("deprecation")
    Locale locale = new Locale("in", "ID");
    Currency currency = Currency.getInstance(locale);

    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getDisplayName());
    System.out.println(currency.getSymbol(locale));
    System.out.println(currency.getDefaultFractionDigits());
    System.out.println(Currency.getAvailableCurrencies().size());
  }

  @Test
  public void testCurrencyUSA() {
    @SuppressWarnings("deprecation")
    Locale locale = new Locale("en", "US");
    Currency currency = Currency.getInstance(locale);

    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getDisplayName());
    System.out.println(currency.getSymbol(locale));
    System.out.println(currency.getDefaultFractionDigits());
    System.out.println(Currency.getAvailableCurrencies().size());
  }

  @Test
  public void testCheckAllAvailableCurrency() {
    for (var currency : Currency.getAvailableCurrencies()) {
      System.out
          .println(
              currency.getCurrencyCode() + " - " + currency.getSymbol() + 1 + " - " + currency.getDisplayName());

    }
  }
}
