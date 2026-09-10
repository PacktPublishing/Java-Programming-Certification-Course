// Append the String representation (StringBuffer)
// Understand the difference between String and StringBuffer object
// Code by Studyopedia

class Demo69 {
    static void main(String[] args) {

        String s = "ABCDE";
        s = s + "FGHIJ"; // create a new string object
        System.out.println(s);

        StringBuffer sb = new StringBuffer("ABCDE");
        sb.append("FGHIJ"); // modifies the same object
        System.out.println(sb);
    }
}