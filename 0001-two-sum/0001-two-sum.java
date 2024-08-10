class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(j!=i && nums[i] + nums[j] == target){
                    int [] temp = {i,j};
                    return temp;
                }
            }
        }
        return new int[] {};
    }
}