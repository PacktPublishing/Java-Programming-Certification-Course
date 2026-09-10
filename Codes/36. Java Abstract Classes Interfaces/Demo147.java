// Abstract Classes in Java
// Code by Studyopedia

abstract class Animal {

    public abstract void sound(); // abstract method

    public void sleep() { // concrete method
        System.out.println("zzz...");
    }
}
    class Cat extends Animal {
      public void sound() {
        System.out.println("Meow");
     }
}

   public class Demo147 {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.sound();
        c.sleep();
    }
   }
