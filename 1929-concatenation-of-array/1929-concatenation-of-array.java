class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] con_arr  = new int[nums.length * 2];

        for(int i=0; i<nums.length; i++){
            con_arr[i] = nums[i];
            con_arr[i+(nums.length)] = nums[i];
        }
        return con_arr;
    }
}