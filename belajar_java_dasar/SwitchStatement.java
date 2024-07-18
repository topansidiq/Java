public class SwitchStatement {
    public static void main(String[] args) {
        char nilai = 'A';

        switch (nilai) {
            case 'A':
                System.out.println("Anda lulus sempurna");
                break;
            case 'B':
                System.out.println("Anda Lulus!");
                break;
            default:
                System.out.println("Anda salah masuk!");
                break;
        }

        /// Switch Lambda
        switch (nilai) {
            case 'A' -> System.out.println("Anda lulus!");
            default -> {
                System.out.println("Anda tidak lulus!");
            }
        }

        /// Keyword yield
        String ucapan = switch (nilai) {
            case 'A':
                yield "Wah, anda lulus sempurna hebat sekali!";
            default:
                yield "Okelah!";
        };

        System.out.println(ucapan);
    }
}
