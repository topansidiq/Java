package topan.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {
  @Test
  public void testCreateEmptyOrSingleStream() {
    Stream<String> streamEmpty = Stream.empty();
    Stream<String> streamOne = Stream.of("topan");
    Stream<String> streamNullable = Stream.ofNullable(null);

    System.out.println(streamEmpty.count());
    System.out.println(streamOne.count());
    System.out.println(streamNullable.count());
  }

  @Test
  public void testCreateArrayStream() {
    Stream<String> streamArray1 = Stream.of("Topan", "Sidiq", "Salsabila", "Agustin");
    Stream<Integer> streamArray2 = Stream.of(3, 56, 7, 45, 90, 12, 7, 66, 98);

    String[] array = {};
    Stream<String> streamArray3 = Arrays.stream(array);

    streamArray1.forEach(value -> {
      System.out.println(value);
    });
    streamArray2.forEach(value -> {
      System.out.println(value);
    });
    streamArray3.forEach(value -> {
      System.out.println(value);
    });
  }

  @Test
  public void testCreateCollectionStream() {
    Collection<String> collectionStream = List.of("Topan", "Sidiq", "Salsa");
    Stream<String> streamString = collectionStream.stream();
    streamString.forEach(System.out::println);
  }

  @Test
  public void testCreateInfiniteStream() {

    // Jangan jalankan kode ini, PLEASE!!!!
    // Stream<String> streamInfinite = Stream.generate(() -> "Topan");
    // Stream<String> streamInfinite2 = Stream.iterate("Topan", value ->
    // value.toUpperCase());

    // streamInfinite.forEach(System.out::println);
    // streamInfinite2.forEach(System.out::println);
  }

}
