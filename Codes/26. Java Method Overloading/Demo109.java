/* Function (Method) Overloading - Add numbers of similar types but different count of parameters */
// Code by Studyopedia

public class Demo109 {

    // The demoAdd() method is overloaded
    // Similar types but different count of parameters
    static int demoAdd(int a, int b) {
        return a + b;
    }

    static int demoAdd(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int n1 = demoAdd(5, 10);
        int n2 = demoAdd(5, 10, 15);

        System.out.println("Adding two integers = "+n1);
        System.out.println("Adding three integers = "+n2);
    }
}
