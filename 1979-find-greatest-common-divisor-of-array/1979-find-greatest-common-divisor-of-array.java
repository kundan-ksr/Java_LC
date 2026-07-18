class Solution {
    public int findGCD(int[] nums) {
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n=nums.length, gcd=0;

        for(int i=0; i<n; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for(int i=1; i<=min; i++){
            if((min % i) == 0 && max % i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
}