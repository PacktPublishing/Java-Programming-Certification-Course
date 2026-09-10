// Read a string value from the user in Java
// Code by Studyopedia

import java.util.Scanner;

class Demo7 {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        String country;

        // User enters the country name and enter is pressed
        System.out.println("Enter the country name");
        country = ob.nextLine();

        System.out.println("Country name = "+country);
        ob.close();
    }
}