// Remove an item from a HashMap in Java
// Code by Studyopedia

import java.util.HashMap;

class Demo81 {
    static void main(String[] args) {

        HashMap<String, String> player = new HashMap<>();

        player.put("Virat", "India");
        player.put("Steve", "Australia");
        player.put("Joe", "England");
        player.put("Kane", "New Zealand");
        player.put("Chaminda", "Sri Lanka");
        player.put("Litton", "Bangladesh");

        System.out.println(player);

        // Remove an item
        player.remove("Litton");

        // Updated HashMap
        System.out.println(player);
    }
}