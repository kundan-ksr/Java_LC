class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for (int i = 1; i < timeSeries.length; i++) {

            // add duration normally
            if (timeSeries[i] - timeSeries[i - 1] >= duration) {
                count += duration;
            }

            else { // if next attack occurs before current duration ends, include the difference

                count += timeSeries[i] - timeSeries[i - 1]; // it is done to count the duration only    once, not repeat it
            }

        }
        
        return count + duration;  // include last attack from teemo
    }
}