class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String start = strs[0];
        String end = strs[n-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<Math.min(start.length(), end.length()); i++){
            if(start.charAt(i) != end.charAt(i)){
                return sb.toString();
            }
            sb.append(end.charAt(i));
        }
        return sb.toString();
    }
}