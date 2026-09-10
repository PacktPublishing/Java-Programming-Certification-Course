// continue statement in Java
// example 1
// Code by Studyopedia

class Demo43 {
    public static void main(String[] args) {

        int i = 100;

        do {
            if (i == 110) {
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i < 115);

    }
}