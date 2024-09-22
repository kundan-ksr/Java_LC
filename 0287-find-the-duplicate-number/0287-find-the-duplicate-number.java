class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] duplicate = new boolean[nums.length+1];
        for(int i: nums) {
            if(duplicate[i]) {
                return i;
            }
            duplicate[i] = true;
        }
        return -1;
    }
}