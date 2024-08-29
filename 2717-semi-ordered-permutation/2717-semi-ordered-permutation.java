class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int opr = 0, j = 0;
//         finding 1
        for(int i=0; i<nums.length; i++)    
            if(nums[i] == 1)    j = i;
//         operating 1 to start index
        while(j > 0){
            nums[j] = nums[j-1];
            nums[j-1] = 1;
            opr++;
            j--;
        }
//         finding n
        for(int i=0; i<nums.length; i++)    
            if(nums[i] == nums.length)    j = i;
//         operating n to last index
        while(j < nums.length-1){
            nums[j] = nums[j+1];
            nums[j+1] = nums.length;
            opr++;
            j++;
        }   
        return opr;
    }
}