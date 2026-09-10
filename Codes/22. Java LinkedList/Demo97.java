// Get an item from the end of the LinkedList in Java
// Code by Studyopedia

import java.util.LinkedList;

class Demo97 {
    static void main(String[] args) {

        LinkedList<String> devices = new LinkedList<>();

        // Add string elements
        devices.add("TV");
        devices.add("Laptop");
        devices.add("Tablet");
        devices.add("Desktop");
        devices.add("Notebook");
        devices.add("Phone");

        System.out.println(devices);

        // Get an item from the end
        System.out.println(devices.getLast());
    }
}