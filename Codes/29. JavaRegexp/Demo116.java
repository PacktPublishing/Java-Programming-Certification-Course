// Find multiple occurrences (with index) of a letter in a word with Regex
// Code by Studyopedia

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo116 {
    public static void main(String[] args) {

        String word = "banana";
        String regex = "a";

        // Patter.compile("a") looks for letter "a"
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        // matcher.find() finds each occurrence
        // matcher.start() gives the index of the match
        while(matcher.find()) {
            System.out.println(matcher.start());
        }
    }
}