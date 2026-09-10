// Get the size of an ArrayList in Java
// Code by Studyopedia

import java.util.ArrayList;

class Demo72 {
    static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
      
        myList.add("Laptop");
        myList.add("Tablet");
        myList.add("Mobile");
        myList.add("TV");
        myList.add("Desktop");

        System.out.println(myList);
        System.out.println(myList.size());
    }
}
