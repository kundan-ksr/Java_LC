class Solution {
    public int minOperations(String[] l) {
        int count = 0;
        for (int i = 0; i < l.length; i++) {
            if(l[i].contains("../")){
                count--;
                continue;
            }else if(l[i].contains("./")){
                continue;
            }else if(l[i].contains("/")){
                count++;
            }
        }
        return Math.abs(count);
    }
}