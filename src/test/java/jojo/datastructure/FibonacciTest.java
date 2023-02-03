package jojo.datastructure;

import jojo.recursion.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testNumberLesserThanOne() {
        Assertions.assertEquals(0, Fibonacci.fib(0));
    }

    @Test
    public void testNormalCase() {
        Assertions.assertEquals(3, Fibonacci.fib(4));
    }

}
