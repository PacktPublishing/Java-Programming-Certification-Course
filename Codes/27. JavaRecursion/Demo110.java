// Recursion in Java
// Calculate the Factorial
// Code by Studyopedia

class Demo110 {

   static int factMethod(int n) {
        if(n >= 1) {
           return n*factMethod(n - 1); //Recursive Call // 5x4x3x2x1
        }
        else {
            return 1; // 0! = 1
        }
    }

    public static void main(String[] args) {
        int res = factMethod(5);
        System.out.println(res);
    }
}