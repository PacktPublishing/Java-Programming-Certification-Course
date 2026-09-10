// Create and call a Function (Method) in Java
// Code by Studyopedia

class Demo105 {

    /* We add the static keyword in Java so that a method belongs to the class itself,
     rather than to individual objects created from that class */
    /* A static method is tied to the class itself. Even if no object of Demo105 exists,
     the method can still be executed. */
    // Function Definition
    static void demoMethod() {
        System.out.println("This is a demo method in Java.");
    }

    public static void main(String[] args) {
        // Function call/ invoke
        demoMethod();
    }
}