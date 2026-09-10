// break statement in Java
// Code by Studyopedia

class Demo40 {
    public static void main(String[] args) {

        int i = 5;

        while (i < 10) {
            System.out.println(i);
            i++;

            if (i > 7) {
                break;
            }
        }
    }
}