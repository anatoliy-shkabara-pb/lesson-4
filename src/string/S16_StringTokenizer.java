package string;

import java.util.StringTokenizer;

public class S16_StringTokenizer {
    public static void main(String[] args) {
        String str = "This is String , split by StringTokenizer, created by mkyong";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("---- Split by space ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("---- Split by comma ',' ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}
