package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S19_TestRegEx {

    public static final Pattern pattern = Pattern.compile
            ("[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))");

    public static void doMatch(String word) {
        Matcher matcher = pattern.matcher(word);
        System.out.println("Validation for " + word +
                (matcher.matches() ? " passed." : " not passed."));
    }

    public static void main(String[] args) {
        doMatch("c0nst@money.simply.net");
        doMatch("Name.Sur_name@gmail.com");
        doMatch("useR33@somewhere.in.the.net");
    }
}
