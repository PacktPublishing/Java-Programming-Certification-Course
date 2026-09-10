// Protected Modifier in Java
// Code by Studyopedia

// Parent class
class Parent {
    protected String fname = "Ramesh";

    public void demo1() {
        System.out.println("This is the parent class");
    }
}

// Child class
class Child extends Parent {

    String sname = "Sachin";
    public void demo2() {
        System.out.println("This is the child class");
    }
}

class Demo138 {
    public static void main(String[] args) {

        // Child class object
        Child c = new Child();

        // The child class inherits the method demo1() of the parent class
        c.demo1();
        c.demo2();

        System.out.println("Father's name = "+c.fname);
        System.out.println("Son's name = "+c.sname);
    }
}