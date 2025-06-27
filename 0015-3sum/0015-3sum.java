class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            //remove duplicates for i-
            if (i != 0 && arr[i] == arr[i - 1])
                continue;

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    int currentJ = arr[j];
                    int currentK = arr[k];
                    j++;
                    k--;

                    //skipping j & k duplicates-
                    while (j < k && arr[j] == currentJ) j++;
                    while (j < k && arr[k] == currentK) k--;

                }
            }
        }
        return ans;
    }
}