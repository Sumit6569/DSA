class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int gola_index = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                gola_index = i - 1;
                break;
            }
        }

        // Step 2: If a decreasing element is found, find the next greater element and swap
        if (gola_index != -1) {
            int swap_index = gola_index;
            for (int j = n - 1; j >= gola_index + 1; j--) {
                if (nums[j] > nums[gola_index]) {
                    swap_index = j;
                    break;
                }
            }

            // Swap nums[gola_index] and nums[swap_index]
            int temp = nums[gola_index];
            nums[gola_index] = nums[swap_index];
            nums[swap_index] = temp;
        }

        // Step 3: Reverse the subarray after gola_index
        reverse(nums, gola_index + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
