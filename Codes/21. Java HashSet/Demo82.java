// Create a HashSet in Java
// Code by Studyopedia

import java.util.HashSet;

class Demo82 {
    static void main(String[] args) {

        HashSet<String> sports = new HashSet<>();

        // Adding string elements with duplicates
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Badminton");
        sports.add("Volleyball");
        sports.add("PickleBall");
        sports.add("Tennis");

        System.out.println(sports);
    }
}