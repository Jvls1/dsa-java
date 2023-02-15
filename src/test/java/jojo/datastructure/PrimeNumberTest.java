package jojo.datastructure;

import jojo.recursion.PrimeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    @Test
    public void testIsPrimeNumber() {
        Assertions.assertTrue(PrimeNumber.isPrime(	17));
    }

    @Test
    public void testNotPrimeNumber() {
        Assertions.assertFalse(PrimeNumber.isPrime(88));
    }

    @Test
    public void testInvalidNumber() {
        Assertions.assertFalse(PrimeNumber.isPrime(-2));
    }

}
