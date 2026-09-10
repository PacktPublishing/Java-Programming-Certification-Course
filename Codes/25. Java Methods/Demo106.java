// Function (Method) Parameters in Java
// Code by Studyopedia

class Demo106 {

    /* We add the static keyword in Java so that a method belongs to the class itself,
     rather than to individual objects created from that class */
    /* A static method is tied to the class itself. Even if no object of Demo105 exists,
     the method can still be executed.
     */
    // Function Definition with rank parameter
    static void demoMethod(int rank) {
        System.out.println("This is a demo method in Java.");
        System.out.println("Rank = "+rank);
    }
    public static void main(String[] args) {
        
        // Function call with 5 as an argument
        demoMethod(5);
    }
}