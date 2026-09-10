// Remove an item from the beginning of the LinkedList in Java
// Code by Studyopedia

import java.util.LinkedList;

class Demo93 {
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

        // Remove an item from the beginning
        devices.removeFirst();

        System.out.println(devices);
    }
}