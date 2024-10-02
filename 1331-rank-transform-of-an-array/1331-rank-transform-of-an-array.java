class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> index = new HashMap<>();

        int[] arrC = arr.clone();
        Arrays.sort(arrC);
        int rank = 1;

        for(int i=0; i<arr.length; i++){
            if(!index.containsKey(arrC[i])){
                index.put(arrC[i], rank++);
            }
        }
        
        for(int i=0; i<arr.length; i++){
            arr[i] = index.get(arr[i]);
        }
        return arr;
    }
}