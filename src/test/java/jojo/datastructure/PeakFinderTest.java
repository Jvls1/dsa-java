package jojo.datastructure;

import org.junit.jupiter.api.Test;

public class PeakFinderTest {

    @Test
    public void testPeakFinderWithoutOptimization() {
        int[] ints = new int[8];
        ints[0] = 6;
        ints[1] = 7;
        ints[2] = 4;
        ints[3] = 3;
        ints[4] = 2;
        ints[5] = 1;
        ints[6] = 4;
        ints[7] = 5;

        String s = PeakFinder.findWithoutOptimization(ints);

        System.out.println(s);
    }
}
