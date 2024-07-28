package topan.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class CollectOperationTest {
  @Test
  public void testCollectOperation() {
    List<String> names = List.of("Topan", "Sidiq", "Salsa");

    Set<String> set = names.stream().collect(Collectors.toSet());
    System.out.println(set);

    Set<String> setImmutable = names.stream().collect(Collectors.toUnmodifiableSet());
    System.out.println(setImmutable);

    List<String> list = names.stream().collect(Collectors.toList());
    System.out.println(list);
  }

  @Test
  public void testMap() {
    List<String> names = List.of("Topan", "Sidiq", "Salsa");
    Map<String, Integer> map = names.stream().collect(Collectors.toMap(
        name -> name, name -> name.length()));

    map.forEach((key, value) -> System.out.println(key + "_" + value));
  }
}
