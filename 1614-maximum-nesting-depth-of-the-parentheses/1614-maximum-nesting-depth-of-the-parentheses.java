class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxCount=0;
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == '('){
                count++;
                maxCount = Math.max(count, maxCount);
            }else if(ch[i] == ')'){
                count--;
            }
        }
        return maxCount;
    }
}