// Search for a letter in a word with Regex in Java
// Code by Studyopedia

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo115 {
    public static void main(String[] args) {

        // . means a single character
        Pattern pattern = Pattern.compile(".k");
        Matcher matcher = pattern.matcher("ak");

        boolean res = matcher.matches();
        System.out.println("Match Found = "+res);
    }
}