// Interfaces in Java
// Code by Studyopedia

interface Shape {
    abstract void draw(); // abstract is the default
    abstract double area(); // abstract is the default
}

class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Circle");
    }
    public double area() {
        return Math.PI*radius*radius;
    }
}

public class Demo148 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        c.draw();
        System.out.println(c.area());
    }
}