package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S18_RegEx {

    public static void main(String args[]) {

        System.out.println("-123".matches("-?\\d+"));       // да
        System.out.println("123".matches("-?\\d+"));        // да
        System.out.println("+123".matches("-?\\d+"));       // нет
        System.out.println("+123".matches("(-|\\+)?\\d+")); // да

        String pattern = "[a-z]+";
        String text = "code 2 learn java tutorial";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + "*");
        }

    }
}
