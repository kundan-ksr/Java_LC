// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         ArrayList<Integer> ans = new ArrayList<>();

//         Arrays.sort(nums);
//         int curr = nums[0];
        
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] != curr){
//                 while(curr < nums[i]){
//                     ans.add(curr);
//                     curr++;
//                 }
//             }
//             curr++;
//         }
//         return ans;
//     }
// }

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];

        for(int i : nums){
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        int[] arr = new int[max + 1];
        for(int i : nums){
            arr[i]++;
        }

        for(int i=min;i<max;i++){
            if(arr[i] == 0)
                ans.add(i);
        }
        return ans;


    }
}