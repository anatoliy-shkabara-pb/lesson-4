package method;

public class S02_Methods {
    // Методы (Функции).

    // На 9-й строке, создаем метод с именем function, который ничего не принимает и возвращает строковое значение.
    // В теле метода, используя ключевое слово return, возвращаем строку - Hello!

    static String function() {
        return "Hello!";
    }

    static void print(int a) {
        System.out.println(a);
    }

    static void print(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        // В теле метода Main на 15-й строке, создаем строковую локальную переменную с именем string
        // и присваиваем ей возвращаемое значение метода function.

        print("hi");
        System.out.println(function());
    }
}
