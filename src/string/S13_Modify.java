package string;

public class S13_Modify {
    public static void main(String[] args) {
        // Модификация строк не является модификацией как таковой.
        // Дело в том, что объекты класса  String после создания уже нельзя изменять.
        // Но можно создать копию строки с изменениями. Именно это и делают следующие методы.
        //toLowerCase() — преобразовать строку в нижний регистр;
        //toUpperCase() — преобразовать строку в верхний регистр;
        //trim() — отсечь на концах строки пустые символы;

        String str = " Я помню ЧУДНОЕ мгновенье ";

        //убрали символы пробела в начале и конце строки
        str = str.trim();

        //я помню чудное мгновенье
        System.out.println(str.toLowerCase());

        //Я ПОМНЮ ЧУДНОЕ МГНОВЕНЬЕ
        System.out.println(str.toUpperCase());


        // String replace(char oldChar, char newChar), replace(CharSequence target, CharSequence replacement)
        // — замена в строке одного символа или подстроки на другой символ или подстроку.

        String str2 = "1 000 000 000";
        String newStr = str2.replace(" ", ".");
        System.out.println(newStr);
    }
}
