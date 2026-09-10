// if-else if-else statement in Java
// Code by Studyopedia

class Demo32 {
    public static void main(String[] args) {

        int marks = 73;

        if(marks >= 90) {
            System.out.println("Grade A");
        } 
        else if (marks >= 75 && marks < 90) {
            System.out.println("Grade B");
        }
        else if (marks >= 65 && marks < 75) {
            System.out.println("Grade C");
        }
        else if (marks >= 50 && marks < 65) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("FAIL");
        }
    }
}