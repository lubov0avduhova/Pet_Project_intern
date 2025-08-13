package org.example.intern_project;

/**
 * Utility methods for working with even numbers.
 */
public final class EvenNumberUtils {

    private EvenNumberUtils() {
        // Utility class
    }

    /**
     * Returns the sum of even numbers from the provided array.
     *
     * @param numbers numbers to sum
     * @return sum of even numbers or {@code 0} if {@code numbers} is {@code null}
     */
    public static int sumEvenNumbers(int... numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}

