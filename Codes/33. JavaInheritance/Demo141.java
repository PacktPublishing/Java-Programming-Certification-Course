// Multilevel Inheritance in Java
// Code by Studyopedia

class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car driving");
    }
}

class SportsCar extends Car {
  void turbo() {
    System.out.println("Sports car turbo");
  }
}

class Demo141 {
    public static void main(String[] args) {

        SportsCar sc = new SportsCar();

        sc.start(); // From Vehicle
        sc.drive(); // From Car
        sc.turbo(); // From SportsCar
    }
}