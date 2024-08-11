class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> missingElement = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++)
        {
            missingElement.put(nums[i], nums[i]);
        }
        
        for(int i = 1; i<=nums.length; i++)
        {
            if(!missingElement.containsValue(i)){
                result.add(i);
            }
        }


        return result;
    }
}