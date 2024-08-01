package topan_i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ResourceBundleTest {
  @Test
  public void testResourceBundle() {
    var resourceBundle = ResourceBundle.getBundle("message");
    System.out.println(resourceBundle.getString("can"));
    System.out.println(resourceBundle.getString("good"));
  }

  @Test
  public void testResourceBundleIDN() {
    @SuppressWarnings("deprecation")
    var indonesia = new Locale("in", "ID");
    var resourceBundle = ResourceBundle.getBundle("message", indonesia);
    System.out.println(resourceBundle.getString("can"));
    System.out.println(resourceBundle.getString("snake"));
  }

  @Test
  public void testResourceBundleMultipleTime() {
    @SuppressWarnings("deprecation")
    var indonesia = new Locale("in", "ID");
    var resourceBundle1 = ResourceBundle.getBundle("message", indonesia);
    var resourceBundle2 = ResourceBundle.getBundle("message", indonesia);
    var resourceBundle3 = ResourceBundle.getBundle("message", indonesia);
    System.out.println(resourceBundle1 == resourceBundle2);
    System.out.println(resourceBundle2 == resourceBundle3);
  }
}
