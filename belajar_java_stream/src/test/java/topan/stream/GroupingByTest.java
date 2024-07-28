package topan.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class GroupingByTest {
  @Test
  public void testGroupingBy() {
    Map<String, List<Integer>> collectMap = Stream.of(81, 72, 73, 94, 85, 76, 87, 88, 79, 90).collect(
        Collectors.groupingBy(number -> {
          if (number < 80) {
            return "\nNilai anda " + number + ". Selamat anda lolos\n";
          } else {
            return "\nNilai anda " + number + ". Mohon maaf, anda belum beruntung\n";
          }
        }));

    System.out.println(collectMap.toString());
  }

  @Test
  public void testPartitioningBy() {
    Map<Boolean, List<Integer>> collectMap = Stream.of(81, 72, 73, 94, 85, 76, 87, 88, 79, 90).collect(
        Collectors.groupingBy(number -> {
          return number > 80;
        }));

    System.out.println(collectMap);
  }
}