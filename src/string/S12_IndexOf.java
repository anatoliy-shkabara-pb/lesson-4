package string;

public class S12_IndexOf {
    public static void main(String[] args) {
        // int indexOf(int ch),  indexOf(int ch, int fromIndex), indexOf(String str),  indexOf(String str, int fromIndex)
        // — метод indexOf применяется для поиска первого вхождения указанного символа в строке или первого вхождения
        // указанной подстроки. Поиск также можно произвести с указанием позиции в строке от которой нужно начинать искать.
        // Для поиска нужно указать соответствующие параметры.
        // Метод возвращает число соответствующее индексу первого вхождения символа или подстроки.
        // В случае отсутствия указанного символа или подстроки в строке, будет возвращена -1.

        String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
        //разбиваем строку на несколько подстрок на основании
        // встречаемого символа новой строки
        String[]lines=data.split("\n");

        //проходим каждую подстроку
        for (String line : lines){
            //находим индекс первого вхождения символа ":" в подстроке
            int pos = line.indexOf(":");
            //вычленяем имя атрибута из подстроки
            String attributeName= line.substring(0,pos);
            //вычленяем значение атрибута
            String value = line.substring(pos+1,line.length());
            //вывод на экран вычлененных значений в нужном нам формате.
            System.out.println(attributeName + " - " + value);
        }

        // int lastIndexOf(int ch), lastIndexOf(int ch, int fromIndex),  lastIndexOf(String str), lastIndexOf(String str, int fromIndex)
        // — аналогично предыдущему случаю, только ищется последнее вхождение символа или подстроки в строке.
    }
}
