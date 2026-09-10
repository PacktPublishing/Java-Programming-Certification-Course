// Write to a File in Java
// Code by Studyopedia

import java.io.FileWriter;

class Demo123 {
    public static void main(String[] args) {

        try {
              FileWriter fWriter = new FileWriter("E:\\Amit\\myfile.txt");

              fWriter.write("This is a demo text written to our file.");

              fWriter.close();
              System.out.println("Text written to our file.");

        }
        catch (Exception e) {
          System.out.println("Error");
        }
    }
}