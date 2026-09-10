// Arithmetic Assignment Operators in Java
// Code by Studyopedia

class Demo12 {
    public static void main(String []args) {

        int a, b, c, d, e;
        a = 5;
        b = 10;
        c = 15;
        d = 20;
        e = 30;

        a += 5;  // a = a + 5
        System.out.println("Value of a = "+a);

        b -= 5;  // b = b - 5
        System.out.println("Value of b = "+b);

        c *= 5;  // c = c * 5
        System.out.println("Value of c = "+c);

        d /= 10;  // d = d / 10
        System.out.println("Value of d = "+d);

        e %= 9;  // e = e % 9
        System.out.println("Value of e = "+e);
    }
}