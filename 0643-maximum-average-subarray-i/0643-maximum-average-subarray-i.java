class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        if(nums.length <=k){
            int sum = 0, cnt = 0;
            for(int i=0; i<nums.length; i++){
                sum += nums[i];
                cnt++;
            }
            return (double) sum/cnt;
        }

        int j=0;
        int sum = 0;
        double maxAvg = 0;
        int cnt = 0;
        int s = 0;

        while(j<k){
            sum += nums[j];
            cnt++;
            j++;
        }
        maxAvg = (double) sum/cnt;

        for(int i=k; i<nums.length; i++){
            sum -= nums[s];
            s++;
            sum += nums[i];
            maxAvg = Math.max((double)sum/k, maxAvg);
        }
        return maxAvg;
    }
}