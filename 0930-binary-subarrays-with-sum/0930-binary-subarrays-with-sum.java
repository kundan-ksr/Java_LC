class Solution {
// see for detail's
// https://www.youtube.com/watch?v=ZZ5bOSRxAqM&t=940s 

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    public int atMost(int[] nums, int goal) {
        int i = 0, j = 0, ans = 0, sum = 0, n = nums.length;

        while (j < n) {
            sum += nums[j];
            while (sum > goal && i <= j) {
                sum -= nums[i];
                i++;
            }
            ans += j - i + 1;
            j++;
        }
        return ans;
    }
}