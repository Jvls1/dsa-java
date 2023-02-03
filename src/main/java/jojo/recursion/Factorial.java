package jojo.recursion;

public class Factorial {

    public static int fac(int n) {
        if(n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}
