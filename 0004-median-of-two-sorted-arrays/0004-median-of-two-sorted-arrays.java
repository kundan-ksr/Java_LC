class Solution { 
    public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
        int index=0; 
        int[] m=new int[nums1.length+nums2.length]; 
        for(int i=0;i<nums1.length;i++){ 
            m[index]=nums1[i]; 
            index++; 
        } 
 
      for(int i=0;i<nums2.length;i++){ 
            m[index]=nums2[i]; 
            index++; 
            } 
            Arrays.sort(m); 
            if(m.length%2==0){ 
                int mid=m.length/2; 
            return (m[mid - 1] + m[mid]) / 2.0; 
        }  
            return m[m.length / 2]; 
    } 
}