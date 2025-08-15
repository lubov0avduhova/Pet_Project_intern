package org.example.intern.project.algo;

public final class TwoSumUtils {
    private TwoSumUtils() {
        throw new UnsupportedOperationException("Don't instantiate utility class");
    }

    public static int[] inputArrayIsSorted(int[] nums, int target) {
        for (int left = 0, right = nums.length - 1; left < right; ) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}
