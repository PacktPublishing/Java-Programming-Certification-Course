// Delete a Folder in Java
// Code by Studyopedia

import java.io.File;

class Demo126 {
    public static void main(String[] args) {
        try {
            File obj = new File("E:\\Amit");

            if (obj.delete()) {
                System.out.println("Folder Deleted = " + obj.getName());
            } else {
                System.out.println("Folder Not Deleted");
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}