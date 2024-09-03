class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i) - 'a' + 1);
        }
        int sum = 0;
        int i=0;
        while(i<sb.length()){
            sum += sb.charAt(i) - '0';
            i++;
        }
        

        while (k > 1) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
            k--;
        }
        return sum;
    }
}