class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        
        int count1 = 0;
        int count2 = 0;

        int maj1 = 0;
        int maj2 = 0;

    // Part to search for majority element;
        for(int i=0; i<n; i++){
            if(nums[i] == maj1){
                count1++;
            }
            else if(nums[i] == maj2){
                count2++;
            }
            else if(count1 == 0){
                maj1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                maj2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }


    //Verification if the element is a majority element.
        // if we don't do this step we will get error in testcase 1
            //see what the error is by output.
        int freq1 = 0, freq2 = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == maj1){
                freq1++;
            }
            else if(nums[i] == maj2){
                freq2++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if(freq1 > n/3) ans.add(maj1);
        if(freq2 > n/3) ans.add(maj2);
        
        return ans;
    }
}