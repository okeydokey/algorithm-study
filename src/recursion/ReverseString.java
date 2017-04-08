package recursion;

/**
 * Created by yhkim on 2017-04-04.
 */
public class ReverseString {
    public static void main(String[] args) {
        exec("Hello World");
    }

    public static void exec(String str) {
        if(str.length() == 0) {

        } else {
            exec(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}
