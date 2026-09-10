// Create multiple objects in Java
// Code by Studyopedia

class Recctangle {

    /* Two instance variables
       These are variables declared inside a class but outside any method.
       They represent the properties/attributes of an object. */
    // For the Rectangle class, the class members are length and width.
    double length;
    double width;
}

public class Demo100 {
    // For the Demo100 class, the class member is the main() method.
    public static void main(String[] args) {

        // Creating two objects rct1 and rct2.
        // Each Rectangle object will have its own copy of instance variables.
        Recctangle rct1 = new Recctangle();
        Recctangle rct2 = new Recctangle();

        double area1;
        double area2;

        // rct1
        // object rct1 with its own copy of instance variables
        rct1.length = 10;
        rct1.width = 5;

        area1 = rct1.length * rct1.width;
        System.out.println("Length of Rectangle1 = " +rct1.length);
        System.out.println("Width of Rectangle1 = " +rct1.width);
        System.out.println("Area of Rectangle1 = " +area1);

        // rct2
        // object rct2 with its own copy of instance variables
        rct2.length = 20;
        rct2.width = 15;

        area2 = rct2.length * rct2.width;
        System.out.println("\nLength of Rectangle2 = " +rct2.length);
        System.out.println("Width of Rectangle2 = " +rct2.width);
        System.out.println("Area of Rectangle2 = " +area2);

    }
}