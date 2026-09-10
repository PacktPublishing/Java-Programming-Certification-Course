// Display the keys from a HashMap in Java
// Code by Studyopedia

import java.util.HashMap;

class Demo80 {
    static void main(String[] args) {

        HashMap<String, String> player = new HashMap<>();

        player.put("Virat", "India");
        player.put("Steve", "Australia");
        player.put("Joe", "England");
        player.put("Kane", "New Zealand");
        player.put("Chaminda", "Sri Lanka");
        player.put("Litton", "Bangladesh");

        System.out.println(player);

        for (String s: player.keySet()) {
            System.out.println(s);
        }
    }
}