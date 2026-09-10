// Append the string representation with StringBuffer
// Code by Studyopedia

class Demo66 {
    static void main(String[] args) {

        StringBuffer message = new StringBuffer("ABCD");
        System.out.println(message);

        // append
        message.append('E');

        System.out.println("The updated string = "+message);
    }
}