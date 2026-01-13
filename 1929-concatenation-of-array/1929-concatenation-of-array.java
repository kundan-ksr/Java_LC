class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] con_arr  = new int[nums.length * 2];

        for(int i=0; i<nums.length*2; i++){
            con_arr[i] = nums[i%nums.length];
        }
        return con_arr;
    }
}