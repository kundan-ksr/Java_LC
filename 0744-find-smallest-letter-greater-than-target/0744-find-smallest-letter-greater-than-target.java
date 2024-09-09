class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch= '1';
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] > target){
                ch = letters[i];
                return ch;
            }
        }
        return letters[0];
    }
}