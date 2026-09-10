// Hierarchical Inheritance in Java
// Code by Studyopedia

class Shape {
    void area() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {

    double radius = 10;
    void displayCircleArea() {
        System.out.println("Area of circle = "+(Math.PI*radius*radius));
    }
}

class Rectangle extends Shape {
    double length = 4, width = 6;

    void displayRectangleArea() {
        System.out.println("Rectangle area = "+(length*width));
    }
}

class Triangle extends Shape {
   double base = 4, height = 6;

   void displayTriangleArea() {
      System.out.println("Triangle Area = "+(0.5*base*height));
  }
}

class Demo142 {
    public static void main(String[] args) {
        Circle c = new  Circle();
        c.area(); // inherited from the Shape class
        c.displayCircleArea();

        Rectangle r = new  Rectangle();
        r.area(); // inherited from the Shape class
        r.displayRectangleArea();

        Triangle t = new Triangle();
        t.area(); // inherited from the Shape class
        t.displayTriangleArea();
    }
}


