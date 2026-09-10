// Multiple Interfaces in Java
// Code by Studyopedia

// First Interface
interface Singer {
     void sing();
}

// Second Interface
interface Dancer {
     void dance();
}

// Our class will implement both the interfaces
class Performer implements Singer, Dancer {
    public void sing() {
        System.out.println("I'm singing");
    }
    public void dance() {
        System.out.println("I'm dancing");
    }
}

class Demo149 {
    public static void main(String[] args) {

        Performer p = new Performer();
        p.sing();
        p.dance();
    }
}







