class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lessCnt = 0, eqCnt = 0, gretCnt = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot)
                lessCnt++;
            else if (nums[i] == pivot)
                eqCnt++;
            else
                gretCnt++;
        }

        int[] pivotSortedArr = new int[n];
        int left = 0;
        int mid = lessCnt;
        int right = lessCnt + eqCnt;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                pivotSortedArr[left] = nums[i];
                left++;
            } else if (nums[i] == pivot) {
                pivotSortedArr[mid] = nums[i];
                mid++;
            } else {
                pivotSortedArr[right] = nums[i];
                right++;
            }
        }
        return pivotSortedArr;
    }
}