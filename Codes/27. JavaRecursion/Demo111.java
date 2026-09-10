// Recursion in Java
// Sum of first n numbers
// Code by Studyopedia

class Demo111 {

    static int sumMethod(int n) {
        if(n>0) {
            return n + sumMethod(n-1); // recursive call
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
      System.out.println("Sum of first n numbers = "+sumMethod(5));
    }
}
