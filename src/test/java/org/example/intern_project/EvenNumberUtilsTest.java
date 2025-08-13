package org.example.intern_project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenNumberUtilsTest {

    @Test
    void sumEvenNumbers_whenArrayIsNull_returnsZero() {
        int result = EvenNumberUtils.sumEvenNumbers((int[]) null);
        assertEquals(0, result);
    }

    @Test
    void sumEvenNumbers_returnsSumOfEvenNumbers() {
        int result = EvenNumberUtils.sumEvenNumbers(1, 2, 3, 4, 5, 6);
        assertEquals(12, result);
    }
}
