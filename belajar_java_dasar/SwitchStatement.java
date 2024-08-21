public class SwitchStatement {
    public static void main(String[] args) {
        // char nilai = 'A';

        // switch (nilai) {
        // case 'A':
        // System.out.println("Anda lulus sempurna");
        // break;
        // case 'B':
        // System.out.println("Anda Lulus!");
        // break;
        // default:
        // System.out.println("Anda salah masuk!");
        // break;
        // }

        // /// Switch Lambda
        // switch (nilai) {
        // case 'A' -> System.out.println("Anda lulus!");
        // default -> {
        // System.out.println("Anda tidak lulus!");
        // }
        // }

        // /// Keyword yield
        // String ucapan = switch (nilai) {
        // case 'A':
        // yield "Wah, anda lulus sempurna hebat sekali!";
        // default:
        // yield "Okelah!";
        // };

        // System.out.println(ucapan);

        Character nilaiA = 'Z';
        switch (nilaiA) {
            case 'A':
                System.out.println("Anda lolos");
                break;
            case 'B':
                System.out.println("Anda lulus percobaan");
                break;
            case 'C':
                System.out.println("Anda bodoh");
                break;
            default:
                System.out.println("Anda waras?");
                break;
        }

    }
}
