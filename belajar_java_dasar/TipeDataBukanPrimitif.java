public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        /// Tipe Data Bukan Primitif = Object
        /// Biasanya diawali dengan huruf kapital
        String name;
        Integer thisIntegerNonPrimitif = 121;

        /// Konversi dari bukan primitif ke primitif
        int thisIntegerPrimitif = thisIntegerNonPrimitif;

        /// Konversi dari type data primitif
        Integer thisIntegerNonPrimitif2 = thisIntegerPrimitif;
        int thisIntegerPrimitif2 = thisIntegerNonPrimitif2.intValue();
    }
}
