import java.time.LocalDate;
import java.util.Currency;
import java.util.Set;

public class ForLoop {
    public static void main(String[] args) {

        // /// For Loop
        // for (var i = 0; i < 10; i++) {
        // System.out.println(i + 1 + ". Halo!");
        // }

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);
        // System.out.println(6);
        // System.out.println(7);
        // System.out.println(8);

        // System.out.println(1 + ". Angka ke-" + 1);
        // System.out.println(2 + ". Angka ke-" + 2);

        Set<Currency> currencies = Currency.getAvailableCurrencies();
        currencies.forEach(currency -> {
            System.out.println(currency);
            if (currency.toString().equals("IDR")) {
                System.out.println(currency.getDisplayName());
            }
        });

        for (int i = 1; i <= 100; i++) {

            LocalDate localDate = LocalDate.now();
            if (i == localDate.getMonthValue()) {
                System.out.println("Sekarang bulan ke-" + i + ", yaitu bulan " + localDate.getMonth());
            }
            if (i == localDate.getDayOfMonth()) {
                System.out.println("Sekarang tanggal " + i);
                continue;
            }

            if (i % 10 == 0) {
                continue;
            } else if (i % 5 == 0) {
                int nilaiBaru = i * 5;
                System.out.println(nilaiBaru + " dikali 5");
                continue;
            } else if (i % 2 == 0) {
                System.out.println(i + " Genap");
            } else {
                System.out.println(i + " Ganjil");
            }

        }
    }
}
