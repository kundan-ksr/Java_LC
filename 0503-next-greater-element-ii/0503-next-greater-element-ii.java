class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        
        int n = nums.length;
        for (int i = 2 * (n - 1); i >= 0 ; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]){
                st.pop();
            }
            if (st.isEmpty() == false){
                result[i % n] = st.peek();
            } else {
                result[i % n] = -1;
            }
            st.push(nums[i % n]);
        }


        return result;
    }
}