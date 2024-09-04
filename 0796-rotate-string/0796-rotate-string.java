class Solution {
    public boolean rotateString(String s, String goal) {
        
        // char[] st = s.toCharArray();
        // char[] go = goal.toCharArray();
        // int n = st.length;
        // boolean isEqual = false;
        // char ch;

        // if (s.length() != goal.length()) {
        //     return false;
        // }
        // if(s.equals(goal)){
        //     return true;
        // }

        // for (int i = 0; i < n; i++) {
        //     ch = st[0];
        //     for (int j = 0; j < n-1; j++) {
        //         st[j] = go[(j+1)];
        //     }
        //     st[n-1] = st[0];



        //     if(st.toString().equals(go.toString())){
        //         isEqual = true;
        //     }
        // }
        // return isEqual;







        if (s.length() != goal.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);
    
    }
}