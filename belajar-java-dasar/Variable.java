public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Topan Sidiq";

        int age;
        age = 22;

        System.out.println("My name is " + name + ". I'm " + age + " years old.");

        /// Keyword var
        var x = 17;
        var y = 9;
        var z = x - y;

        System.err.println(z);

        // var a; // Error!

        /// Keyword final
        final String APP_NAME = "belajar-java-dasar";

        System.err.println(APP_NAME);
    }
}
