// Get the min from an array
// Code by Studyopedia

class Demo50 {
    public static void main(String[] args) {

        int[] marks = {50, 89, 40, 95, 99};

        int min_val = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min_val ) {
                min_val = marks[i];
            }
        }

        System.out.println("Minimum = "+min_val);
    }
}