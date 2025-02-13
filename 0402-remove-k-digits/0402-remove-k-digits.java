class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0"; // Removing all digits

        Stack<Character> stack = new Stack<>();
        
        
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        // Remove remaining digits if needed
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the final number
        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            if (result.length() == 0 && digit == '0') continue; // Skip leading zeros
            result.append(digit);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}