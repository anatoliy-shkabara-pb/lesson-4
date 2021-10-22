package method;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class S11_MethodsOverload {
    // Перегруженные методы могут отличаться типом и количеством аргументов.

    static void function() {                 // 1-я перегрузка.
        System.out.println("Hello!");
    }

    static void function(String s) {        // 2-я перегрузка.
        System.out.println(s);
    }

    static void function(String s, String s2) {        // 2-я перегрузка.
        System.out.println(s);
    }

    static void function(int i) {           // 3-я перегрузка.
        System.out.println(i);
    }

    static void function(double d) {        // 4-я перегрузка.
        System.out.println(d);
    }

    static void function(String s, int i) { // 5-я перегрузка.
        System.out.println(s + i);
    }

    static void function(int i, String s) { // 6-я перегрузка.
        System.out.println(i + s);
    }

//    static void function(int qwer, String s) {   // 7-я перегрузка.
//        return s;
//    }

    public static void main(String[] args) throws Exception {
//        function();                  // 1-я перегрузка.
//        function("A");               // 2-я перегрузка.
//        function(1);                 // 3-я перегрузка.
//        function(3.14);              // 4-я перегрузка.
//        function("B ", 2);           // 5-я перегрузка.
//        function(3, " C");           // 6-я перегрузка.


        Scanner in = new Scanner(System.in);
        String str = in.next();

        int y = 0;
        try {
            y = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("Вы ввели не число (" + str + ")");
        }

        BufferedReader br;
        System.out.println("y = " + y);

//        Random rand = new Random();
//        for (int i = 0; i < 50; i++) {
//            int x = rand.nextInt(101);
//            System.out.println(x);
//        }
    }
}
