package string;

public class S11_StartsWith {
    public static void main(String[] args) {
        //boolean  startsWith(String prefix) или  startsWith(String prefix, int toffset) — проверяет,
        // начинается ли строка с определенных символов.  Во втором случае можно указать позицию с которой необходимо
        // начать поиск префикса.
        String s = "www.mysite.com";

        //Проверяем, начинается ли адрес с www
        boolean isWWW = s.startsWith("www");

        if (isWWW) {
        /* Eсли да, проверяем начинается ли имя сайта
        с "my". Поскольку адрес начинается с www
        проверку начинаем с 4 символа*/
            boolean isNameStarts = s.startsWith("my", 4);
        } else {
        /* Eсли нет, проверяем начинается ли имя сайта
        с "my". Поскольку адрес не начинается с www
        проверку производим с начала строки*/
            boolean isNameStarts = s.startsWith("my");
        }
    }
}
