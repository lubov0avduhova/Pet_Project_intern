package org.example.intern_project;

public class EvenNumberUtils {

    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        return result;
    }
}