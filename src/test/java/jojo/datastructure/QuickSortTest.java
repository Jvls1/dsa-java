package jojo.datastructure;

import jojo.sort.QuickSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class QuickSortTest {

    private int[] numbers;

    @BeforeEach
    public void fillTheArray() {
        Random rand = new Random();
        numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
    }

    @Test
    public void testQuickSort() {
        QuickSort.sort(numbers);
    }

}
