package jojo.datastructure;

import jojo.sort.SelectionSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SelectionSortTest {

    private Integer[] numbers;

    @BeforeEach
    public void fillTheArray() {
        Random rand = new Random();
        numbers = new Integer[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
    }

    @Test
    public void testSelectioSort() {
        SelectionSort.sort(numbers);
    }
}
