class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            st.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(!st.contains(i+1)){
                ans.add(i+1);
            }
        }

        return ans;
    }
}