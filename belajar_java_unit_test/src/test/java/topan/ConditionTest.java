package topan;

import java.util.Properties;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {
  @Test
  @EnabledOnOs(OS.WINDOWS)
  public void testRunOnlyOnWindows() {

  }

  @Test
  @DisabledOnOs(OS.MAC)
  public void testDisableOnMac() {

  }

  @Test
  @EnabledOnJre(JRE.JAVA_20)
  void testEnableOnJava20() {
  }

  @Test
  @DisabledOnJre(JRE.JAVA_10)
  void testEnableOnJava10() {

  }

  @Test
  @EnabledForJreRange(min = JRE.JAVA_15, max = JRE.JAVA_20)
  void testEnabledOnJava15To20() {

  }

  @Test
  @DisabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_14)
  void testDisabledOnJava10To14() {

  }

  @Test
  @Disabled
  void testSystemProperties() {
    Properties properties = System.getProperties();
    properties.forEach((key, value) -> System.out.println(key + ": " + value));
  }

  @Test
  @EnabledIfSystemProperties({
      @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
  })
  public void testEnabledForJavaVendorOracle() {

  }

  @Test
  @DisabledIfSystemProperties({
      @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
  })
  public void testDisabledOnJavaVendorOracle() {

  }

  @Test
  @EnabledIfEnvironmentVariables({
      @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
  })
  public void testEnabledOnProfileDev() {

  }

  @Test
  @DisabledIfEnvironmentVariables({
      @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
  })
  public void testDisabledOnProfileDev() {

  }

}
