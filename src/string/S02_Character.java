package string;

public class S02_Character {
    public static void main(String[] args) {
        System.out.println("Символ 2 это цифра: " + Character.isDigit('2'));
        System.out.println("Символ ъ это буква: " + Character.isLetter('ъ'));
        System.out.println("Символ \\t это пустое пространство: " + Character.isWhitespace('\t'));
        System.out.println("Верхний регистр символа а: " + Character.toUpperCase('а'));
        System.out.println("Нижний регистр символа А: " + Character.toLowerCase('А'));
    }
}
