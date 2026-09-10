// Check if a word contains a letter in Java with Regex
// Code by Studyopedia

class Demo117 {
    public static void main(String[] args) {

        String word = "hello";

        if(word.matches(".*e.*")) {
            System.out.println("Word contains e");
        }
        else {
            System.out.println("Word not contains e");
        }
    }

}