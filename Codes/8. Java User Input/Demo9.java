// Read a double value from the user in Java
// Code by Studyopedia

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        double points;

        // User enters the points and enter is pressed
        System.out.println("Enter the Player Points:");
        points = ob.nextDouble();

        System.out.println("Points = " + points);
        ob.close();
    }
}
