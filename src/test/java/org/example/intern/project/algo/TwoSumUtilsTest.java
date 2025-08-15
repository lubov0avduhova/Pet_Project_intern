package org.example.intern.project.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumUtilsTest {
    //Пара в начале
    @Test
    public void inputArrayIsSorted_shouldReturnPair_whenPairIsAtTheBeginning() {
        int[] nums = new int[]{1, 2, 4, 8, 10};
        int target = 3;

        Assertions.assertArrayEquals(new int[]{0, 1}, TwoSumUtils.inputArrayIsSorted(nums, target));
    }


    //Пара в середине
    @Test
    public void inputArrayIsSorted_shouldReturnPair_whenPairIsAtTheMiddle() {
        int[] nums = new int[]{1, 3, 5, 7, 9};
        int target = 12;

        Assertions.assertArrayEquals(new int[]{1, 4}, TwoSumUtils.inputArrayIsSorted(nums, target));
    }

    //Пара в конце
    @Test
    public void inputArrayIsSorted_shouldReturnPair_whenPairIsAtTheEnd() {
        int target = 18;
        int[] nums = new int[]{2, 4, 6, 8, 10};

        Assertions.assertArrayEquals(new int[]{3, 4}, TwoSumUtils.inputArrayIsSorted(nums, target));
    }
}
