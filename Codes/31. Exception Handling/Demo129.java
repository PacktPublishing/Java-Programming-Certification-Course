// Exception handling with try...catch and display the exception
// Code by Studyopedia

class Demo129 {
    public static void main(String[] args) {
        try{
            int[] marks = {60, 92, 87, 66};
            System.out.println(marks[5]);
        }
        catch(Exception e){
            System.out.println("Exception caught: " +e);
        }
    }
}