package recursion;

/**
 * Created by yhkim on 2017-04-04.
 */

// x^n
public class Power {
    public static void main(String[] args) {
        System.out.println(exec(2,10));
    }

    public static int exec(int x, int n) {
        if(n == 1) {
            return x;
        } else {
            return x * exec(x, n-1);
        }
    }
}
