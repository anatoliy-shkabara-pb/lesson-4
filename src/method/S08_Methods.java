package method;

public class S08_Methods {
    // Пример: Использование сторожевого оператора, для защиты номинального варианта.

    static String function(String name) {
        // Выполняем проверку. При обнаружении ошибок завершаем работу.

        if (name.equals("fool")) {  // Сторожевой оператор.
            return "Вы использовали недопустимое слово.";
        }

        // Код номинального варианта.

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {
        String sentence = function("world");

        System.out.println(sentence);
    }
}
