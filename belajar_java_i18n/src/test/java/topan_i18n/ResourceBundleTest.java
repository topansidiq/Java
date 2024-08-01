package topan_i18n;

import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ResourceBundleTest {
  @Test
  public void testResourceBundle() {
    var resourceBundle = ResourceBundle.getBundle("message");
    System.out.println(resourceBundle.getString("hello"));
  }
}
