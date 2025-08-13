package org.example.intern_project;

public class EvenNumberUtils {
    public EvenNumberUtils() {
    }

    public int sumNumbers(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int result = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        return result;
    }
}