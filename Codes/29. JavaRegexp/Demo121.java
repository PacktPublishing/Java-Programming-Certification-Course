// Extract all numbers from a sentence with Regex in Java
// Code by Studyopedia

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo121 {
    public static void main(String[] args) {

        String text = "Order 3 cricket bats and 10 balls";
        String regex ="\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("Number = "+matcher.group());
        }
    }
}