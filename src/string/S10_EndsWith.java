package string;

public class S10_EndsWith {
    public static void main(String[] args) {
        // boolean endsWith(String suffix) — проверяет завершается ли строка определенными символами и возвращает true или false.
        String s = "www.mysite.com";

        //проверяем заканчивается ли строка суффиксом "com"
        boolean isComEnding = s.endsWith("com");
        System.out.println(isComEnding);//выведет true

        //проверяем заканчивается ли строка суффиксом "ru"
        boolean isRuEnding = s.contains("ru");
        System.out.println(isRuEnding);//выведет false
    }
}
