// Function (Method) Overloading - Add numbers of different types
// Code by Studyopedia

class Demo108 {

    // The demoAdd() method is overloaded
    // Different types but same count of parameters
    static int demoAdd(int a, int b) {
        return a + b;
    }

    static double demoAdd(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        int n1 = demoAdd(5, 10);
        double n2 = demoAdd(3.5, 4.3);

        System.out.println("Adding two numbers = "+n1);
        System.out.println("Adding two doubles = "+n2);
    }
}