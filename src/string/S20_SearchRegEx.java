package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S20_SearchRegEx {

    public static void main(String[] args) {
        Pattern regexp = Pattern.compile("<[a-z]+>");
        Matcher m = regexp.matcher("<a><b-><1><c><d/>");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
