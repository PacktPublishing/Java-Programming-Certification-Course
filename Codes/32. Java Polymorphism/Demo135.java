// Compile-time polymorphism (Method Overloading) in Java
// Code by Studyopedia

class Calculate {

    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Demo135 {
    public static void main(String[] args) {

        Calculate obj = new Calculate();
        System.out.println(obj.add(10, 15));
        System.out.println(obj.add(3.5, 4.5));
        System.out.println(obj.add(5, 10, 15));
    }
}