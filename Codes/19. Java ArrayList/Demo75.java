// Access an ArrayList element in Java
// Code by Studyopedia

import java.util.ArrayList;

class Demo75 {
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

        System.out.println("Element 1 = "+myList.get(0));
        System.out.println("Element 2 = "+myList.get(1));
        System.out.println("Element 3 = "+myList.get(2));
        System.out.println("Element 4 = "+myList.get(3));

    }
}
