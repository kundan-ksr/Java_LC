class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int sInd = -1;
        int eInd = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                sInd = i;
            }
            else if(nums[i] == nums.length){
                eInd = i;
            }
        }
        if(sInd < eInd){
            return ((sInd) + (nums.length-1-eInd));
        }else{
            return ((sInd) + (nums.length-2-eInd));
        }
    }
}