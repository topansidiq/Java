package util;

public class StringUtil {

  public static boolean isLowerCase(String value) {
    for (var c : value.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }

  public static boolean isEmpty(String value) {
    if (value == null || value == "") {
      return true;
    }
    return false;
  }

}
