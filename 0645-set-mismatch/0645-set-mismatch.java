class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sumNums = 0;
        int sumSet = 0;
        boolean[] seen = new boolean[n+1];
        int duplicate = 0;

        for (int num : nums) {
            sumNums += num;
            if (!seen[num]) {
                sumSet += num;
                seen[num] = true;
            } else {
                duplicate = num;
            }
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - sumSet;

        return new int[]{duplicate, missing};
    }
}