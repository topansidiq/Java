package topan.default_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DefaultMethodApp {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

    for (int i = 1; i < 100; i++) {
      numbers.add(i);
    }

    System.out.println(numbers);

    numbers.replaceAll(new UnaryOperator<Integer>() {
      Random random = new Random();
      int value = random.nextInt(100);

      @Override
      public Integer apply(Integer integer) {
        return integer * 10 / value;
      }
    });

    System.out.println(numbers);

    numbers.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println(integer);
      }
    });

    numbers.removeIf(new Predicate<Integer>() {
      public boolean test(Integer integer) {
        return integer > 500;
      }
    });

    System.out.println(numbers);
  }
}
