class Solution {
    public boolean isPalindrome(int x) {
//My Approach :
        // String s = Integer.toString(x);
        // int n = s.length();
        // for(int i=0; i<n/2; i++){
        //     if(s.charAt(i) != s.charAt(n-i-1)) return false;
        // }
        // return true;
            
// no negative number can read as a palindrome
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int actual = x;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return (actual == reversed);
    }
}