// finally in Java
// Code by Studyopedia

class Demo131 {
    public static void main(String[] args) {

        try {
            int[] marks = {60, 92, 87, 66, 90, 88};
            System.out.println(marks[5]);
        }
        catch(Exception e) {
            System.out.println("Something very wrong");
        }
        finally {
            System.out.println("The code ends.");
        }
    }
}