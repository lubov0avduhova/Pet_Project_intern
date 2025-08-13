package org.example.intern.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumberUtilsTest {
    EvenNumberUtils utils = new EvenNumberUtils();

    @Test
    public void sumEvenNumbers_shouldReturnZero_whenArrayIsNull(){
        int[] array = null;

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void sumEvenNumbers_shouldReturnZero_whenArrayIsEmpty(){
        int[] array = new int[]{};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void sumEvenNumbers_shouldReturnZero_whenArrayIsOdd(){
        int[] array = new int[]{1, 3, 5};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void sumEvenNumbers_shouldReturnCorrectSum_whenArrayHasEvenNumbers(){
        int[] array = new int[]{2, 4, 6};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void sumEvenNumbers_shouldReturnCorrectSum_whenArrayHasNegativeEvenNumbers(){
        int[] array = new int[]{-2, -4, -6};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(-12, result);
    }
}
