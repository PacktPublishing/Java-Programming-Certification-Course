// Loop through the ArrayList in Java
// Code by Studyopedia

import java.util.ArrayList;

class Demo74 {
    static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        // adding values
        myList.add("Laptop");
        myList.add("Tablet");
        myList.add("Mobile");
        myList.add("TV");
        myList.add("Desktop");

        System.out.println(myList);

        // Loop through the ArrayList
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
