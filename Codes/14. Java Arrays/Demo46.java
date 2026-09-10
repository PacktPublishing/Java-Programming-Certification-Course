// One-Dimensional (1D) Array in Java
// Code by Studyopedia

class Demo46 {
    public static void main(String[] args) {

        int result = 0;

        /* Method1: Creating a new array
        int[] marks;
        marks = new int[] {50, 89, 55, 95, 99, 87, 67, 85, 98, 90};
         */

        // Method2: Creating a new array
        // Creating and initializing an array without using new keyword
        int[] marks = {50, 89, 55, 95, 99, 87, 67, 85, 98, 90};

        // Error: java.lang.ArrayIndexOutOfBoundsException
        // Index 11 out of bounds for length 10
        // marks[11] = 20;

        /* Method3: Creating a new array
       int[] marks = new int[10];
        // Assigning values
        marks[0] = 50;
        marks[1] = 89;
        marks[2] = 55;
        marks[3] = 95;
        marks[4] = 99;
        marks[5] = 87;
        marks[6] = 67;
        marks[7] = 85;
        marks[8] = 98;
        marks[9] = 90; */

        // Display the array
        System.out.println("Marks of all the 10 Students:");

        for (int i = 0; i < marks.length; i++) {
           System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // Sum of marks
        System.out.println("\nSum of Marks:");
        for (int i = 0; i < marks.length; i++) {
            result = result + marks[i]; // result+=marks[i]
        }
        System.out.println(result);
    }
}