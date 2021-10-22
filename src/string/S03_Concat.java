package string;

public class S03_Concat {
    public static void main(String[] args) {

        String abc = "Hello!" + " World";
        String abc2 = new StringBuilder().append("Hello!").append(" World").toString();

        System.out.println("5 + 8 = " + (5 + 8));

        String s = "Я стану программистом!";
        s = s.concat(" Очень хорошим программистом!");
        System.out.println(s);

        String str1 = "Мама ";
        String str2 = "мыла ";
        String str3 = "раму";
        String result = str1 + str2 + str3;
        System.out.print(result);

        String[] animals = {"Хаски", "Морж"};// массив строк 1
        String[] food = {"колбаски", "корж"}; // массив строк 2
        //составляем строки из элементов массивов и связующего слова
        String result1 = animals[0] + " ест " + food[0];
        String result2 = animals[1] + " ест " + food[1];
        //выводим на консоль
        System.out.println(result1);
        System.out.println(result2);

        concatArray();
        System.out.println();

        long start = System.currentTimeMillis();
        concatPlus();
        System.out.println("Длительность concatPlus: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        concatStringBuilder();
        System.out.println("Длительность concatStringBuilder: "
                + (System.currentTimeMillis() - start));
    }

    private static void concatArray() {
        String[] auto = {"Волга", "Чайка", "Жигули"}; //задан массив строк
        String result = "В гараже стоят машины: "; //задана строка

        //прибавляем к строке элементы массива
        for (int i = 0; i < auto.length; i++) {
            //если элемент не последний, разделяем запятой
            if (i != auto.length - 1)
                result += auto[i] + ", ";
                //если последний, ставим после него точку
            else
                result += auto[i] + ".";
        }
        //выводим результат
        System.out.print(result);
    }

    private static void concatPlus() {
        String s = "";
        for (int i = 0; i < 10_000; i++) {
            s = s + "a";
        }
        System.out.println("concatPlus длинна строки: " + s.length());
    }

    private static void concatStringBuilder() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            b.append("a");
        }
        System.out.println("concatStringBuilder длинна строки: " + b.length());
    }
}
