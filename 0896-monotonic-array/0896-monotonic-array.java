class Solution {
    public boolean isMonotonic(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxx = Integer.MIN_VALUE;

        // int inc = 0;
        if(nums[0] <= nums[1]){
            for(int i=1; i<nums.length; i++){
            if(nums[i-1] <= nums[i]){
                continue;
            }
            else return false;
        }
        // return true;
        }

        // int dec = 0;
        if(nums[0] >= nums[1]){
            for(int i=1; i<nums.length; i++){
            if(nums[i-1] >= nums[i]){
                continue;
            }
            else return false;
        }
        }
        return true;
    }
}