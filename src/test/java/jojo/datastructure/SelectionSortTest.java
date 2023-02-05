package jojo.datastructure;

import jojo.sort.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SelectionSortTest {

    @Test
    public void sortEmptyArray() {
        String[] lista = new String[10];
        lista[0] = "Hello";
        lista[1] = "World";
        lista[2] = "Test";
        lista[3] = "Jojo";
        SelectionSort.sort(lista);
    }
}
