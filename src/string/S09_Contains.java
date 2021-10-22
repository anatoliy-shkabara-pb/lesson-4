package string;

public class S09_Contains {
    public static void main(String[] args) {
        // boolean contains(CharSequence s) — проверяет, содержит ли строка заданную последовательность символов
        // и возвращает true или false.

        String s = "www.mysite.com";
        boolean isContain1 = s.contains("mysite");
        System.out.println(isContain1);// нашел - выведет true

        boolean isContain2 = s.contains("mysite.ru");
        System.out.println(isContain2);// не нашел - выведет false
    }
}
