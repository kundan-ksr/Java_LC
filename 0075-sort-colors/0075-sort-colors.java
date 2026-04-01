class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int m = 0;
        int e = nums.length - 1;

        while(m <= e){
            if(nums[m] == 0){
                int temp = nums[s];
                nums[s] = nums[m];
                nums[m] = temp;
                s++;
            }
            if(nums[m] == 2){
                int temp = nums[e];
                nums[e] = nums[m];
                nums[m] = temp;
                e--;
                continue;
            }
            m++;
        }


    }
}
















/*
        int zeros = 0;
        int ones = 0;

        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 0) zeros++;
            else if(nums[i] == 1) ones++;
        }
        for (int i=0; i<nums.length; i++) {
            if(zeros > 0){
                nums[i] = 0;
                zeros--;
                continue;
            }
            if(ones > 0){
                nums[i] = 1;
                ones--;
                continue;
            }
            nums[i] = 2;            
        }

*/