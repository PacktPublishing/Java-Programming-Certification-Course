// Check if a word contains at least one vowel with Regex in Java
// Code by Studyopedia

class Demo119 {
    public static void main(String[] args) {

        String word = "education";

        if(word.matches(".*[aeiou].*")) {
            System.out.println("Contains vowel");
        }  else {
            System.out.println("no vowel found");
        }
    }

}