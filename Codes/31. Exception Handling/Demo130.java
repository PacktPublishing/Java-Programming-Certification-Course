// Multiple catch blocks in Java
// Code by Studyopedia

class Demo130 {
    public static void main(String[] args) {

        try {
            int[] marks = {60, 92, 87, 66};
            System.out.println(marks[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        catch(Exception e) {
            System.out.println("Something very wrong");
        }
    }
}