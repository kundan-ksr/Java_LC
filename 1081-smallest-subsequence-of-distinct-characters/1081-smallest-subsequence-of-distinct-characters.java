class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[27]; // frequency of each letter (1–26)
        boolean[] seen = new boolean[27]; // track if letter is already in stack
        Stack<Character> stack = new Stack<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) & 31]++; // & 31 maps char to 1–26
        }

        // Step 2: Process each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c & 31; // alphabet index (1–26)
            freq[idx]--; // one occurrence used

            if (seen[idx])
                continue; // skip if already in stack

            // Step 3: Maintain lexicographically smallest order
            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() & 31] > 0) {
                seen[stack.pop() & 31] = false; // remove bigger char if it appears later
            }

            stack.push(c);
            seen[idx] = true;
        }

        // Step 4: Build result string
        StringBuilder res = new StringBuilder();
        for (char c : stack) {
            res.append(c);
        }
        return res.toString();
    }
}
