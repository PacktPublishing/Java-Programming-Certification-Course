// Remove an item between the LinkedList in Java
// Code by Studyopedia

import java.util.LinkedList;

class Demo95 {
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

        // Remove an item between
        devices.remove(2);

        System.out.println(devices);
    }
}