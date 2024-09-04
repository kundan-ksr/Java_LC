class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            char[] citizens = details[i].toCharArray();
            // int age = ;
            if((((citizens[11]-'0')*10) + citizens[12]-'0') > 60){
                count++;
            }
        }
        return count;
    }
}