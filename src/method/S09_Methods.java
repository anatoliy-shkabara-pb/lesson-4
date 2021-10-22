package method;

import java.util.Scanner;

public class S09_Methods {
    // Параметр, передаваемый по значению, уничтожается при возврате значения методом

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("Значение int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);

        // Принимаем ввод от пользователя и преобразуем его в целочисленное значение

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Значение result = " + result);
        //result = 10;
        // В качестве аргумента передается не сама переменная - result, а её копия.
        int result2 = addTwo(result);


        System.out.println(result);

        System.out.println(result2);

        //System.out.println(result);
    }
}
