// Read an int value from the user in Java
// Code by Studyopedia

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int marks;

        // User enters the marks and enter is pressed
        System.out.println("Enter your Marks:");
        marks = ob.nextInt();

        System.out.println("Marks = " + marks);
        ob.close();
    }
}