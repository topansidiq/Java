package topan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Information test")
public class InformationTest {
  @Test
  @Tags({
      @Tag("One"),
      @Tag("Two")
  })
  @DisplayName("This is test1")
  void test1(TestInfo info) {
    System.out.println(info.getDisplayName());
    System.out.println(info.getTags());
    System.out.println(info.getTestClass().orElse(null));
    System.out.println(info.getTestMethod().orElse(null));
  }
}
