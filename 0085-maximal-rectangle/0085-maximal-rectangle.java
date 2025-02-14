class Solution {

    // Function to compute Maximum Area Histogram (MAH)
    public static int Maximum_Area_Histogram(int[] heights) {
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

    // Function to compute Maximal Rectangle
    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int rows = matrix.length, cols = matrix[0].length;
        int[] V = new int[cols]; // 1D array representing histogram heights
        int maxRectangle = 0;

        // Convert 2D matrix to 1D histogram and process each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '0') {
                    V[j] = 0; // Reset height if 0 is encountered
                } else {
                    V[j] += 1; // Increment height if 1 is encountered
                }
            }
            // Compute MAH for the current histogram and update maxRectangle
            maxRectangle = Math.max(maxRectangle, Maximum_Area_Histogram(V));
        }

        return maxRectangle;
    }
}