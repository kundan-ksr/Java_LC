class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int[] NSL = new int[n]; // Nearest Smaller to Left
        int[] NSR = new int[n]; // Nearest Smaller to Right
        int[] width = new int[n]; // Width array
        int maxArea = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        // Find NSL (Nearest Smaller to Left)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            NSL[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        
        stack.clear(); // Clear the stack for the next use
        
        // Find NSR (Nearest Smaller to Right)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            NSR[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        
        // Calculate width and area
        for (int i = 0; i < n; i++) {
            width[i] = NSR[i] - NSL[i] - 1; // Compute width
            maxArea = Math.max(maxArea, heights[i] * width[i]); // Compute max area
        }
        
        return maxArea;
    }
}