// Create a Vector in Java
// Code by Studyopedia

import java.util.Vector;

class Demo70 {
    static void main(String[] args) {

        Vector<String> v = new Vector<String>();
        System.out.println(v.size());

        Vector<String> subjects = new Vector<String>(10);
        System.out.println(subjects.size());

        subjects.addElement("PHP");
        subjects.addElement("Maths");
        subjects.addElement("Java");
        subjects.addElement("English");
        subjects.addElement("Science");
        subjects.addElement("IT");
        subjects.addElement("DS");
        subjects.addElement("Algorithms");
        subjects.addElement("Physics");
        subjects.addElement("AI");
        subjects.addElement("TOC");

        // Displaying in a line
        System.out.println(subjects);

        System.out.println(subjects.size());

        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Elements at index "+i+" = "+subjects.elementAt(i));
        }

        // Fetching a specific element using an index
        System.out.println(subjects.elementAt(5));

        // Insert an element at a specific index
        subjects.insertElementAt("GenAI", 2);

        System.out.println("Updated Vector...");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Elements at index "+i+" = "+subjects.elementAt(i));
        }

        System.out.println(subjects.size());

        // Find a specific element
        System.out.println("Does your vector has subject Algorithms? = "+subjects.contains("Algorithms"));

        // Removing elements
        subjects.removeElementAt(2);
        subjects.removeElementAt(5);
        subjects.removeElementAt(7);
        subjects.removeElementAt(8);

        System.out.println("Updated Vector...");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Elements at index "+i+" = "+subjects.elementAt(i));
        }

        System.out.println(subjects.size());
    }
}