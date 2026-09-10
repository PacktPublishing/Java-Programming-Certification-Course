// super keyword to access parent class methods
// Code by Studyopedia

class Animal {
    void sound() {
        System.out.println("Animal speaks");
    }
}

class Cat extends Animal {
    void sound() {
        super.sound(); // call parent class's method
        System.out.println("Cat meows");
    }
}

class Demo143 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}