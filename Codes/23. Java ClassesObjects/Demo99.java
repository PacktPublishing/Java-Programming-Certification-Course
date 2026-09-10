// Create a Class and Object in Java
// Code by Studyopedia

class Recctangle {

    /* Two instance variables
       These are variables declared inside a class but outside any method.
       They represent the properties/attributes of an object. */
    // For the Rectangle class, the class members are length and width.
    double length;
    double width;
}

class Demo99 {
    // For the Demo99 class, the class member is the main() method.
    public static void main(String[] args) {

        // rct is an object of the Rectangle class.
        // Each Rectangle object will have its own copy of these variables.
        Recctangle rct = new Recctangle();
        double area;

        rct.length = 10;
        rct.width = 5;

        area = rct.length * rct.width;
        System.out.println("Area of Rectangle = " +area);

    }
}