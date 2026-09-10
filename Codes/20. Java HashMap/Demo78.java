// Get the size of the HashMap in Java
// Code by Studyopedia

import java.util.HashMap;

class Demo78 {
    static void main(String[] args) {

        HashMap<String, String> player = new HashMap<>();

        player.put("Virat", "India");
        player.put("Steve", "Australia");
        player.put("Joe", "England");
        player.put("Kane", "New Zealand");
        player.put("Chaminda", "Sri Lanka");
        player.put("Litton", "Bangladesh");

        System.out.println(player);

        System.out.println(player.size());

    }
}