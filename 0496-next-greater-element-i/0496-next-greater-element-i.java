class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // map for next greater element.
        Stack<Integer> stack = new Stack<>(); // Process nums2 by iterating backward.

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            while (stack.isEmpty() == false && stack.peek() <= num) {
                stack.pop(); // Pop elements from stack that are less than or equal to num
            }

            if (stack.isEmpty() == false) {
                map.put(num, stack.peek()); // The top of the stack is the next greater element
            } else {
                map.put(num, -1); // No next greater element found
            }

            stack.push(num); // Push the current number onto the stack
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1); // Update element in nums1 with next greater element or -1
        }
        return result;
    }
}