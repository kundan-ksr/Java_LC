class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = hours.length;
        for(int i=0; i<hours.length; i++){
            if(hours[i] < target){
                count--;
            }
        }
        return count;
    }
}