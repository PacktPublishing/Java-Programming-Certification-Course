// Nested ifs in Java
// Code by Studyopedia

class Demo33 {
    public static void main(String[] args) {

        int i = 10;

        if (i > 5) {
            if(i == 8) {
                System.out.println("The value is equal to 8");
            }
            else if((i % 2 == 0)) {
                System.out.println("The value is divisible by 2");
            }
            else {
                System.out.println("The value is not equal to 8");
            }
        }
    }
}
