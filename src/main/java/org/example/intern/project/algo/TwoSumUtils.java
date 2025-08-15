package org.example.intern.project.algo;

public final class TwoSumUtils {
    private TwoSumUtils() {
        throw new UnsupportedOperationException("Don't instantiate utility class");
    }

    public static int[] getTwoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        throw new IllegalArgumentException("Пара не найдена");
    }
}
