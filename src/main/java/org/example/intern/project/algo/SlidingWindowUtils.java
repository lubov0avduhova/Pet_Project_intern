package org.example.intern.project.algo;

public class SlidingWindowUtils {
    private SlidingWindowUtils() {
        throw new UnsupportedOperationException("Don't instantiate utility class");
    }

    public static void main(String[] args) {
        System.out.println(findMinimumSizeSubarraySum(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    /*
    ⏱ Блок 1 (≈1 час): FAANG-дельта — разминка

📌 Уровень: Intern
🧩 Задача 1: Minimum Size Subarray Sum (sliding window)
🎯 Цель: освоить скользящее окно, аккуратно работать с границами
🧪 Ожидания:

Вход: int target, int[] nums (>=0)

Выход: минимальная длина подмассива с суммой ≥ target (или 0, если нет)

Сложность: O(n), память O(1)

Тесты:

target=7, nums=[2,3,1,2,4,3] → 2 (подмассив [4,3])

крайние: нет подходящего; один элемент равен target; пустой массив
📝 Примечание: окно только расширять/сжимать по порядку; никакой сортировки.
     */
    public static int findMinimumSizeSubarraySum(int target, int[] nums) {
        int right = 0;
        int left = 0;

        int result = 0;
        int sum = 0;

        if (nums.length <= 1) return 1;

        while (right < nums.length - 1) {
            right++;
            result += 1;
            if ((nums[left] == target || nums[right] == target)) {
                return 1;
            } else if (sum + nums[right] == target) {
                result++;
                sum = 0;
            } else if (sum + nums[right] > target) {
                left = right;
                result = 0;
                sum = 0;
            }
            sum += nums[right];
        }

        return result;
    }
}
