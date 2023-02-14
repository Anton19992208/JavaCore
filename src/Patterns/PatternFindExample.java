package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    public static void main(String[] args) {

        String phoneNumber  = "+375 (29) 345-21-22 adsdssd +375 (44) 547-21-13" +
                "eeeeeeeee +375 (33) 555-22-33 fffffff";
        String regex  = "(\\+375) \\((\\d{2})\\) \\d{3}-\\d{2}-\\2";

        Pattern pattern  =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
