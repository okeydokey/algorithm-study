package recursion;

/**
 * Created by yhkim on 2017-04-04.
 */
// 1, 1, 2, 3, 5, 8, 13, 21 ...
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(exec(1));
        System.out.println(exec(2));
        System.out.println(exec(3));
        System.out.println(exec(4));
        System.out.println(exec(5));
        System.out.println(exec(6));
        System.out.println(exec(7));
        System.out.println(exec(8));
    }

    public static int exec(int n) {
        if(n == 0 || n == 1) {
            return n;
        } else {
            return exec(n-1) + exec(n-2);
        }
    }
}
