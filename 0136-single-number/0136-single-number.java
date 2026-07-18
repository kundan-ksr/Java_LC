class Solution {
    public int singleNumber(int[] nums) {
        int unq = nums[0];
        for(int i=1; i<nums.length; i++){
            unq ^= nums[i];
        }
        return unq;
    }
}