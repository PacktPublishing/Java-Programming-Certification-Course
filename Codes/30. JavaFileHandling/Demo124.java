// Read a File in Java
// Code by Studyopedia

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Demo124 {
    public static void main(String[] args) {
        try {
            File f =  new File("E:\\Amit\\myfile.txt");

            // Read
            System.out.println("Reading the File");

            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            System.out.println("Closing the File");
            s.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}