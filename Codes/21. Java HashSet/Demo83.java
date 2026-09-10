// Size of a HashSet in Java
// Code by Studyopedia

import java.util.HashSet;

class Demo83 {
    static void main(String[] args) {

        HashSet<String> sports = new HashSet<>();

        // Adding string elements
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Badminton");
        sports.add("Volleyball");
        sports.add("PickleBall");

        System.out.println(sports);

        System.out.println(sports.size());
    }
}