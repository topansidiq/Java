package topan.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
  public static void main(String[] args) {
    Map<String, String> name = Map.of(
        "firstName", "Topan",
        "middleName", "Sidiq",
        "lastName", "Maulana");

    // name.put("name", "Topan Sidiq"); // Ini Error

    System.out.println(name.get("firstName"));

    Map<String, String> emptyMap = Collections.emptyMap();
    Map<String, String> singletonMap = Collections.singletonMap("name", "Topan");
    Map<String, String> mutableMap = new HashMap<>();
    Map<String, String> immutableMap = Collections.unmodifiableMap(mutableMap);

    System.out.println(emptyMap);
    System.out.println(singletonMap);
    System.out.println(immutableMap);
  }
}
