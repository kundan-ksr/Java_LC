class Solution {

    public static int findFirst(int x, int[] arr){
        int first=-1;
        int s=0;
        int e=arr.length-1;
        int m=s+(e-s)/2;

        while(s <= e){
            m = s+(e-s)/2;
            if(arr[m] == x){
                first = m;
                e=m-1;
            }
            else if(arr[m] > x){
                e = m-1;
            }
            else s = m+1;
        }
        return first;
    }
    
    public static int findLast(int x, int[] arr){
        int last=-1;
        int s=0;
        int e=arr.length-1;
        int m=s+(e-s)/2;
        while(s <= e){
            m = s+(e-s)/2;
            if(arr[m] == x){
                last = m;
                s=m+1;
            }
            else if(arr[m] > x){
                e = m-1;
            }
            else s = m+1;
        }
        return last;
    }

    public int[] searchRange(int[] n, int t) {
        int[] ans = new int[]{-1,-1};
        int s=0; 
        int e=n.length-1;
        int m = s+(e-s)/2;

        if(n.length == 0){
            return ans;
        }
        ans[0] = findFirst(t, n);
        ans[1] = findLast(t, n);
        return ans;
    }
}