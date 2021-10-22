package string;

public class S07_Substring {
    public static void main(String[] args) {
        // String substring(int beginIndex, int endIndex) или  substring(int beginIndex) — возвращает новую строку,
        // которая является подстрокой используемой строки. В параметрах метода нужно указать индекс строки, с которого
        // начинается подстрока и индекс, которым заканчивается.
        // Также возможно указывать только начальный индекс.
        // В этом случае будет возвращена подстрока от начального индекса и до конца строки.

        String s = "www.mysite.com";
        String name = s.substring(4, s.length()-4);
        System.out.println(name); // на консоль выведет "mysite"

        String domain = s.substring(4);
        System.out.println(domain); // на консоль выведет "mysite.com"
    }
}
