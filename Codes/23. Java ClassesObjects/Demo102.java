// Adding methods to our class
// Code by Studyopedia

class Rrectangle {

    /* Two instance variables
       These are variables declared inside a class but outside any method.
       They represent the properties/attributes of an object. */
    // For the Rectangle class, the class members are length and width.
    double length;
    double width;

    void displayArea() {
        System.out.println("\nInside the displayArea() function");

        System.out.println("Length of Rectangle = "+length);
        System.out.println("Width of Rectangle = "+width);

        System.out.print("Area of rectangle = ");
        System.out.println(length*width);
    }
}

class Demo102 {
    // For the Demo102 class, the class member is the main() method
    public static void main(String[] args) {

        // rct is an object of the Rectangle class.
        // Each Rectangle object will have its own copy of these variables.
        Rrectangle rct = new Rrectangle();

        rct.length = 10;
        rct.width = 5;

        System.out.println("Length of Rectangle = "+rct.length);
        System.out.println("Width of Rectangle = "+rct.width);

        rct.displayArea();
    }
}