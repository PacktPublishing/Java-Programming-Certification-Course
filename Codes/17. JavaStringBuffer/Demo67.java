// Get the current capacity of a string in StringBuffer
// Code by Studyopedia

class Demo67 {
    static void main(String[] args) {

        StringBuffer message = new StringBuffer("ABCD");
        System.out.println(message);

        System.out.println("Capacity = "+message.capacity()); // 16 + 4
        System.out.println("Length = "+message.length());
    }
}