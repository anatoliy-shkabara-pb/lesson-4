package string;

public class S06_StringMethods {
    public static void main(String[] args) {
        // Определение количества символов в строке
        // int length() — возвращает длину строки. Длина равна количеству символов Unicode в строке.
        String str = "Строка из букв, цифр 492 и специальных символов %*;№?";
        int length = str.length();
        System.out.println("Длина строки = " + length);

        // Извлечение символов из строки
        str = "Последний символ в этой строке - о";
        int last = str.length() - 1;//длина строки - 1, так как отсчет начинается с 0
        char ch = str.charAt(last);
        System.out.println(ch);

        replaceSpaceToDot();
    }

    /**
     * Поменять в строке символы пробела на точки при помощи преобразования в массив символов
     */
    public static void replaceSpaceToDot() {
        String str = "1 000 000 000";
        //преобразовываем строку в массив
        char[] chArray = str.toCharArray();
        //перебираем все элементы массива
        for (int i = 0; i < chArray.length; i++) {
            //находим пробел
            if (chArray[i] == ' ') {
                //заменяем на точку
                chArray[i] = '.';

            }
        }
        //выводим результат
        System.out.println(chArray);
    }
}
