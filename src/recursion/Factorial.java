package recursion;

/**
 * Created by yhkim on 2017-04-04.
 */

// n! = 1 * 2 * 3 * ... * n
public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.exec(10));
    }

    public static int exec(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * exec(n - 1);
        }
    }
}
