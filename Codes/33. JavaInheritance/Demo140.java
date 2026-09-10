// Single Inheritance in Java
// Code by Studyopedia

class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

class Demo140 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();  // Inherited from Animal class
        d.bark(); // Defined in Dog class
    }
}