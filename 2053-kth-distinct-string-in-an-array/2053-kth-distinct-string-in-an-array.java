class Solution {
    public String kthDistinct(String[] arr, int k) {
        StringBuilder sb = new StringBuilder();
        String s;
        for(int i=0; i<arr.length; i++){
            boolean isPresent = false;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j]) && i != j){
                    isPresent = true;
                }
            }
            if(!isPresent){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        s = sb.toString();
        String[] ans = s.split(" ");
        if(ans.length < k){
            return "";
        }

        return ans[k-1];
    }
}