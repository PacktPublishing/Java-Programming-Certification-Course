// Exception handling with try...catch
// Code by Studyopedia

class Demo128 {
    public static void main(String[] args) {
    try{
        int[] marks = {60, 92, 87, 66};
        System.out.println(marks[5]);
     }
    catch(Exception e){
      System.out.println("Something very wrong");
     }
    }
}