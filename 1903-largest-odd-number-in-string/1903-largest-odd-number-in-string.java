class Solution {
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        while(i >= 0){
            char c = num.charAt(i);                                         //char       ascii
            int n = (int)c - 48; // (charAt(i)) is converted to (int)         0    --->  48
            if(n % 2 == 0){
                i--;
            }
            else{
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}