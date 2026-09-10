// Create a File in Java
// Code by Studyopedia

import java.io.File;

class Demo122 {
    public static void main(String[] args) {

        try {
            File f = new File("E:\\Amit\\myfile.txt");

            if (f.createNewFile()) {
                System.out.println("File created "+f.getName());
            }
            else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}