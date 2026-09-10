// Create objects in Java and perform an assignment on object reference variables
// Code by Studyopedia

class Recttangle {

    /* Two instance variables
       These are variables declared inside a class but outside any method.
       They represent the properties/attributes of an object. */
    // For the Rectangle class, the class members are length and width.
    double length;
    double width;
}

public class Demo101 {
    // For the Demo101 class, the class member is the main() method.
    public static void main(String[] args) {

        // Creating an object rct1
        // Each Rectangle object will have its own copy of these variables.
        Recttangle rct1 = new Recttangle();

        double area1;

        // rct1
        // object rct1 with its own copy of instance variables
        rct1.length = 10;
        rct1.width = 5;

        area1 = rct1.length * rct1.width;
        System.out.println("Length of Rectangle1 = " +rct1.length);
        System.out.println("Width of Rectangle1 = " +rct1.width);
        System.out.println("Area of Rectangle1 = " +area1);

        // assigning
        System.out.println("\nrct1 and rct2 will now refer to the same object...");
        Recttangle rct2 = rct1;

        System.out.println("Length of Rectangle2 = " +rct2.length);
        System.out.println("Width of Rectangle2 = " +rct2.width);
    }
}