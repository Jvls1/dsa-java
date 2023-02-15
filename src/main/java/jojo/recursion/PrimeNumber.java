package jojo.recursion;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1 || n < 0)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        for (int i = 3; i < n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
