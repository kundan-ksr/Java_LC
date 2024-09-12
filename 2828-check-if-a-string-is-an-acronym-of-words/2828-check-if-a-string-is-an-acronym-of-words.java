class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<words.size(); i++){
            char ch;
            char[] an = words.get(i).toCharArray();
            sb.append(an[0]);
           
        }
    String finalans = sb.toString();
    return (finalans.equals(s));
    }
}