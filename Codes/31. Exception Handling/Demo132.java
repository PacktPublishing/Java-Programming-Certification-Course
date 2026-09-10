// throw keyword in Java to throw an exception explicitly
// Code by Studyopedia

class Demo132 {

    static void verifyMarks(int marks) {
        if (marks < 50) {
            throw new ArithmeticException("Failed: You must get above 50 to pass.");
        }
        else {
            System.out.println("Passed");
        }
    }

    public static void main(String[] args) {
       
         verifyMarks(40);
    }
}