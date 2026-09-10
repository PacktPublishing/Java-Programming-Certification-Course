// Create a Derived class from a Base class in Java
// Code by Studyopedia

// Parent class
class Parent {
    public void demo1() {
        System.out.println("This is the parent class");
    }
}

// Child class
class Child extends Parent {
    public void demo2() {
        System.out.println("This is the child class");
    }
}

class Demo137 {
    public static void main(String[] args) {
        Child c = new Child();

        // The child class inherits the method demo1() of the parent class
        c.demo1();
        c.demo2();
    }
}
