// Method Overriding in Java
// Code by Studyopedia

class Animal {
    void sound() {
        System.out.println("This is the animal class");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("This is the dog class");
    }
}

class Demo139 {
    public static void main(String[] args) {

        Animal a;

        a = new Animal();
        a.sound();

        a = new Dog();
        a.sound(); // Calls Dog's overridden method

    }
}