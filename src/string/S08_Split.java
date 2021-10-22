package string;

public class S08_Split {
    public static void main(String[] args) {
        // Для разбиения строк на части используется метод String[] split(String regex),
        // который разбивает строку на основании заданного регулярного выражения.
        // Пример простого разбиения строки заданного одним символом.

        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");

        System.out.println("префикс EAN.UCC: " + isbnParts[0]);
        System.out.println("номер регистрационной группы: " + isbnParts[1]);
        System.out.println("номер регистранта: " + isbnParts[2]);
        System.out.println("номер издания: " + isbnParts[3]);
        System.out.println("контрольная цифра: " + isbnParts[4]);
    }
}
