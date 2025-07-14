import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] cha = t.toCharArray();

        if(ch.length != cha.length){
                return false;
            }

        Arrays.sort(ch);
        Arrays.sort(cha);

        for(int i=0; i<cha.length; i++){
            if(ch[i] != cha[i]){
                return false;
            }
        }
        return true;

        // s = ch.toString();
        // t = cha.toString();
        
    }
}