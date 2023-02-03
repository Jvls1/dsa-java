package jojo.datastructure;

import jojo.recursion.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testNegativeNumber() {
        Assertions.assertEquals(0, Factorial.fac(-1));
    }

    @Test
    public void testNormalNumber() {
        Assertions.assertEquals(120, Factorial.fac(5));
    }

    @Test
    public void testDefaultCase1Number() {
        Assertions.assertEquals(1, Factorial.fac(1));
    }

    @Test
    public void testDefaultCase2Number() {
        Assertions.assertEquals(1, Factorial.fac(0));
    }
}
