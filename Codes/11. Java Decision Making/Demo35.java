// Nested Switch in Java
// Code by Studyopedia

class Demo35 {
    public static void main(String[] args) {
        int marks = 75;
        int a = 85;

        switch (marks) {
            case 90:
                System.out.println("Grade A+");
                break;

            case 75:
                switch (a) {
                    case 80:
                        System.out.println("Grade B+");
                        break;

                    case 85:
                        System.out.println("Grade A");
                        break;
                }
        }
    }
}