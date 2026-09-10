// Delete a File in Java
// Code by Studyopedia

import java.io.File;

class Demo125 {
    public static void main(String[] args) {
        File obj = new File("D:\\Demo.txt");

        if(obj.delete()) {
            System.out.println("File Deleted = "+obj.getName());
        } else {
            System.out.println("File Not Deleted");
        }
    }
}