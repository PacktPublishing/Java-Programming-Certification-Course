// Read a boolean value from the user in Java
// Code by Studyopedia

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Did you pass the exam?");
        boolean b = ob.nextBoolean();

        if (b == true) {
            System.out.println("Yes, you passed the exam.");
        } else if (b == false) {
            System.out.println("No, you failed the exam.");
        }
        ob.close();
    }
}