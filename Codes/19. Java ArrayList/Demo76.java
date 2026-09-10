// Remove an ArrayList element in Java
// Code by Studyopedia

import java.util.ArrayList;

class Demo76 {
    static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        // adding values
        myList.add("Laptop");
        myList.add("Tablet");
        myList.add("Mobile");
        myList.add("TV");
        myList.add("Desktop");

        // Loop through the ArrayList
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        // Removing an element
        System.out.println("Element = "+myList.remove(3));

        System.out.println("Updated ArrayList = "+myList);
    }
}
