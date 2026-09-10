// Check if an item exists in a HashSet in Java
// Code by Studyopedia

import java.util.HashSet;

class Demo86 {
    static void main(String[] args) {

        HashSet<String> sports = new HashSet<>();

        // Adding string elements with duplicate items
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Badminton");
        sports.add("Volleyball");
        sports.add("PickleBall");
        sports.add("Tennis");

        System.out.println(sports);

        System.out.println("Does the HashSet contains the item Badminton? = "+sports.contains("Badminton"));
    }
}