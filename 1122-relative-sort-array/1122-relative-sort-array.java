class Solution { 
    public int[] relativeSortArray(int[] arr1, int[] arr2) { 
        ArrayList<Integer> arr=new ArrayList<>(); 
        for(int i=0;i<arr2.length;i++){ 
            for(int j=0;j<arr1.length;j++){ 
                if(arr2[i]==arr1[j]){ 
                    arr.add(arr1[j]); 
                    arr1[j]=-1; 
                } 
            } 
        } 
        Arrays.sort(arr1); 
        for(int i=0;i<arr1.length;i++){ 
            if(arr1[i]!=-1){ 
 
                arr.add(arr1[i]); 
 
            } 
        } 
        int[] obj=new int[arr.size()]; 
        for(int i=0;i<arr.size();i++){ 
         obj[i]= arr.get(i); 
        } 
        return obj; 
    } 
}