package org.example.intern_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumberUtilsTest {
    EvenNumberUtils utils = new EvenNumberUtils();

    @Test
    public void emptyArrayTest(){
        int[] array = new int[]{};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void oddArrayTest(){
        int[] array = new int[]{1, 3, 5};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void evenArrayTest(){
        int[] array = new int[]{2, 4, 6};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void negativeEvenArrayTest(){
        int[] array = new int[]{-2, -4, -6};

        int result = utils.sumNumbers(array);
        Assertions.assertEquals(-12, result);
    }
}
