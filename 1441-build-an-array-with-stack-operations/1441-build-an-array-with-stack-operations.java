class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        
        int cnt = 1;
        for(int i=0; i<target.length; i++){
            ops.add("Push");
            if(target[i] != cnt){
                ops.add("Pop");
                i--;
            }
            cnt++;
        }
        return ops;
    }
}