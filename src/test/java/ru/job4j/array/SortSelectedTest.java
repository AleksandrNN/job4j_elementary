package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {6, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf05elements() {
        int[] data = new int[] {7, 9, 3, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }

}