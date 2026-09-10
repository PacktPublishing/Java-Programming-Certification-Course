// Scope of Variable in Java
// Code by Studyopedia

class Demo3 {
    int id = 5; // instance variable
    static int fees; // static variable

    void collegeDetails() {
        int rank = 10; // local variable
        System.out.println("College Id: " + id);
        System.out.println("College Rank: " + rank);
    }

    public static void main(String []args) {
        Demo3 st = new Demo3();

        fees = 3000;
        System.out.println("College Monthly Fees: " + fees);
        st.collegeDetails();
    }
}
