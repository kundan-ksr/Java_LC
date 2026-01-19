class Solution {
    public void rotate(int[] nums, int k) {
        int[] rotatedArr = new int [nums.length];
        for(int i = 0; i<nums.length; i++){
            rotatedArr[(i+k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotatedArr[i];
        }
    }
}