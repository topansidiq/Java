public class OperasiBoolean {
    public static void main(String[] args) {

        /// Operasi Boolean
        var benar = true;
        var salah = false;

        System.out.println(benar || benar);
        System.out.println(benar || salah);
        System.out.println(salah || benar);
        System.out.println(salah || salah);
    }
}
