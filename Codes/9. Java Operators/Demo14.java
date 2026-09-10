// Logical Operators in Java
// Code by Studyopedia

public class Demo14 {
    public static void main(String[] args) {

        boolean a, b, c, d;
        a = true;
        b = false;
        c = true;
        d = false;

        System.out.println("Value of a&&b = "+(a&&b));
        System.out.println("Value of b||c = "+(b||c));
        System.out.println("Value of a ^ c = "+(a^c));
        System.out.println("Value of !(a&&d) = "+!(a&&d));
    }
}
