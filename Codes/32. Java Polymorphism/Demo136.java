// Run-time polymorphism (Method Overriding) in Java
// Code by Studyopedia

class Bird {
    void sound() {
        System.out.println("Birds make sounds...");
    }
}

// Child class 1
class Sparrow extends Bird {
    void sound() {
        System.out.println("Sparrow chirps...");
    }
}

// Child class 2
class Crow extends Bird {
    void sound() {
        System.out.println("Crow caws loudly..");
    }
}

// Child class 3
class Parrot extends Bird {
    void sound() {
        System.out.println("Parrot mimics..");
    }
}

class Demo136 {
    public static void main(String[] args) {

        // A reference variable b is declared
        Bird b = new Bird();

        // Runtime Polymorphism
        /* When b.sound() is called, the version of sound() belonging to
        the actual object type is executed */

        // This calls Sparrow's version of sound()
        b = new Sparrow();
        b.sound();

        // This calls Crow's version of sound()
        b = new Crow();
        b.sound();

        // This calls Parrot's version of sound()
        b = new Parrot ();
        b.sound();
    }
}


