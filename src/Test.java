import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7};
        m1(array);
        System.out.println(Arrays.toString(array));

        int num = 5;
        add(num);
        System.out.println(num);
        char[] chars = "sfsdf".toCharArray();
        for(char c: chars) {
            System.out.println(c);
        }

    }

    static void m1(int[] mas) {
        mas[0] = -99;
    }

    static void add(int x) {
        x = x + 10;
        System.out.println("x: " + x);
    }
}
