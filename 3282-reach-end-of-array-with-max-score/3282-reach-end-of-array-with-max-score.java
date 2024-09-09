class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long maxScore = 0 ;
        int prevIndex=0;

        for(int i=0; i<nums.size(); i++){

            if(nums.get(i) > nums.get(prevIndex)){
            maxScore += (i-prevIndex) * nums.get(prevIndex);
            prevIndex = i;
            }
        }
        maxScore += (nums.size() - 1 - prevIndex) * nums.get(prevIndex);
        return maxScore;
    }
}