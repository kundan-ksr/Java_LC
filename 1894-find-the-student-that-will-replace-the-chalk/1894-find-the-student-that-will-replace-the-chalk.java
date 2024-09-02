class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long totalChalkSum = 0; //Total chalks required in one iteration.

        for(int ch : chalk){
            totalChalkSum += ch;
        }

        //Number of full iteration possible = k/totalChalkSum

        long remainChalk = k % totalChalkSum;

        for(int i=0; i<n; i++){
            if(remainChalk < chalk[i]){
                return i;
            }
            remainChalk -= chalk[i];
        }
        return -1;
    }
}