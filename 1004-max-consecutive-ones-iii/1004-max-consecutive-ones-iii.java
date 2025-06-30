class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, max = 0;

        for (int right = 0; right < nums.length; right++) {
            // If we encounter a 0, reduce k
            if (nums[right] == 0) {
                k--;
            }

            // If k becomes negative, shrink the window from the left
            while (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }

            // Calculate the maximum length of the window
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
