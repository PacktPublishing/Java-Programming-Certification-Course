// Find digits in a word with Regex in Java
// Code by Studyopedia

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo120 {
    public static void main(String[] args) {

        String word = "Room123";
        String regex = "\\d";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            System.out.println("Found digit = "+matcher.group()+" at index = "+matcher.start());
        }
    }
}