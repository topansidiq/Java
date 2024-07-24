package topan.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
  public static void main(String[] args) {
    List<Integer> mathPass = new ArrayList<>();
    mathPass.add(90);
    mathPass.addAll(List.of(91, 98, 89, 87, 80, 82, 92, 87, 88));

    Collections.sort(mathPass);

    System.out.println(mathPass.toString());

    var rataRata = 0;
    var nilaiTengah = 0;

    if ((mathPass.size() - 1) % 2 == 0) {
      nilaiTengah = (mathPass.get((mathPass.size() / 2) - 1) + mathPass.get(mathPass.size() / 2)) / 2;
    } else if ((mathPass.size() - 1) % 2 == 1) {
      nilaiTengah = mathPass.get((mathPass.size() / 2) - 1);
    }

    for (int i = 0; i < mathPass.size(); i++) {
      rataRata = rataRata + mathPass.get(i);
    }

    System.out.println("Nilai tertinggi: " + mathPass.getLast());
    System.out.println("Nilai terendah: " + mathPass.getFirst());
    System.out.println("Nilai rata-rata: " + rataRata / mathPass.size());
    System.out.println("Nilai tengah: " + nilaiTengah);
  }
}
