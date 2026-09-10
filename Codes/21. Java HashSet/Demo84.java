// Loop through the HashSet in Java
// Code by Studyopedia

import java.util.HashSet;

class Demo84 {
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

        for(String s: sports) {
            System.out.println(s);
        }
    }
}