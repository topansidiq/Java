package topan.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Chips {

  static int play(int... chips) {
    var coin = 0;
    for (var chip : chips) {
      coin = coin + chip;
    }
    return coin;
  }

  static int power(int a, int b) {
    int ab = (int) Math.pow(a, b / 2);
    return ab;
  }

  public static void main(String[] args) {
    Random random = new Random();

    // Queue dengan Array
    Queue<Integer> queue = new ArrayDeque<>();
    var coin = 0;
    var coinrestore = 0;
    var spin = 10;
    var chips = 1_000_000_000;

    var plays = chips / spin;

    int[] hadiah = {};

    for (int i = coin; i <= spin; i++) {
      var tarik = chips - power(i, (i / 2)) + plays;
      if (tarik <= 0) {
        tarik = 0;
      } else {
        hadiah[i] = tarik;
      }

      coinrestore = coinrestore + hadiah[i];
    }

    for (int i = 0; i <= spin; i++) {

      // Mendapatkan nilai random
      play(hadiah);
      var randomValue1 = random.nextInt(100);
      var randomValue2 = random.nextInt(1000);

      // Menyimpan point saat ini
      int point = i + (randomValue1 * randomValue2);

      // Menurunkan penukaran chip dengan point saat ini = mencuri uang
      var lastChips = chips - point;

      // Menyimpan hadiah untuk pemain
      coin = coin + point;
      queue.add(coin);

      // Memberikan kondisi
      if (point == 0) {
        System.out.println("Zonk!");
        System.out.println();
      } else if (point >= (100 * 100)) {
        System.out.println("Big Win! " + point);
      } else if (point >= (100 * 500)) {
        System.out.println("Mega Win! " + point);
      } else if (point >= (100 * 900)) {
        System.out.println("Super Win! " + point);
      } else {
        System.out.println(point);
      }

      chips = lastChips;
    }

    System.out.println(chips);
    // if (coin >= )
  }
}
