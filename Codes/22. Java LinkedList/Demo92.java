// Add an item to the end of the LinkedList in Java
// Code by Studyopedia

import java.util.LinkedList;

class Demo92 {
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

        // Add an item in the end
        devices.addLast("Phone");

        System.out.println(devices);
    }
}