// Add an item to the beginning of the LinkedList in Java
// Code by Studyopedia

import java.util.LinkedList;

class Demo90 {
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

        // Add an item in the beginning
        devices.addFirst("Phone");

        System.out.println(devices);
    }
}