// Loop through the LinkedList in Java
// Code by Studyopedia

import java.util.LinkedList;

class Demo89 {
    static void main(String[] args) {

        LinkedList<String> devices = new LinkedList<>();

        // Add string elements
        devices.add("TV");
        devices.add("Laptop");
        devices.add("Tablet");
        devices.add("Desktop");
        devices.add("Notebook");
        devices.add("Notebook");

        System.out.println(devices);

        for(String s : devices){
            System.out.println(s);
        }
    }
}