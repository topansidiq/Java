public class OperasiMatematika {
    public static void main(String[] args) {

        int penjumlahan = 100 + 1;
        int pengurangan = penjumlahan - 100;
        int perkalian = penjumlahan * pengurangan;
        int pembagian = perkalian / pengurangan;
        int sisaBagi = pembagian % perkalian;

        /// Augmented Assignment
        int a = 100;
        a += 100; // a = a + 100

        /// Unary Operator
        System.out.println(a++);
        System.out.println(--a);
    }
}
