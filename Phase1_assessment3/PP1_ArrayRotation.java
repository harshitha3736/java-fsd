package Phase1_assessment3;

import java.util.Arrays;

public class PP1_ArrayRotation {

	public static void rightRotateByFiveSteps(int[] nums) {
        int n = nums.length;
        int k = 5; // Number of steps to rotate by

        // Normalize the number of steps
        k = k % n;

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first 'k' elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining 'n - k' elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: " +"\n"+ Arrays.toString(nums));

        rightRotateByFiveSteps(nums);

        System.out.println("\nRight Rotated Array: "+"\n" + Arrays.toString(nums));
    }
}