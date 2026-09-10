// Function (Method) with Multiple Parameters in Java
// Code by Studyopedia

class Demo107 {

    /* We add the static keyword in Java so that a method belongs to the class itself,
     rather than to individual objects created from that class */
    /* A static method is tied to the class itself. Even if no object of Demo105 exists,
     the method can still be executed.
     */
    
    // Function Definition with player, rank, and points parameters
    static void demoMethod(String player, int rank, int points) {
        System.out.println("\nThis is a demo method in Java.");
        System.out.println("Player = "+player);
        System.out.println("Rank = "+rank);
        System.out.println("Points = "+points);

    }
    public static void main(String[] args) {

        // Function call with 3 arguments
        demoMethod("Amit", 1, 95);
        demoMethod("Steve", 2, 90);
        demoMethod("David", 3, 80);
    }
}