// Find all vowels in a word with Regex in Java
// Code by Studyopedia

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo118 {
    public static void main(String[] args) {

        String word = "education";
        String regex = "[aeiou]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        while(matcher.find()){
            System.out.println("Vowel found = "+matcher.group()+" at index = "+matcher.start());
        }
    }

}