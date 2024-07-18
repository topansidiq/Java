public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Perulangan ke-" + 1);

            if (i % 2 == 0) {
                continue;
            }
        }
    }
}
