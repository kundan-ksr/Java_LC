class Solution {
    public String truncateSentence(String s, int k) {
        String[] splited = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(splited[i]);
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
}