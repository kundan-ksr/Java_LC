class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);
        int curr = nums[0];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != curr){
                while(curr < nums[i]){
                    ans.add(curr);
                    curr++;
                }
            }
            curr++;
        }
        return ans;
    }
}