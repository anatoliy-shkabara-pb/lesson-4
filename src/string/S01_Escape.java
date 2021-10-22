package string;

public class S01_Escape {
    public static void main(String[] args) {
        System.out.println("prog\tlang.su --> \\t - табуляция");
        System.out.println("prog\blang.su --> \\b - возврат на один шаг назад");
        System.out.println("prog\nlang.su --> \\n - новая строка");
        System.out.println("prog\rlang.su --> \\r - возврат каретки");
        System.out.println("prog\flang.su --> \\f - прогон страницы");
        System.out.println("prog\'lang.su --> \\' - одинарная кавычка");
        System.out.println("prog\"lang.su --> \\\" - двойная кавычка");
        System.out.println("prog\\lang.su --> \\\\ - обратная косая черта");
    }
}
