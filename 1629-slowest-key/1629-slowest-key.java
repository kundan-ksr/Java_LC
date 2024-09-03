class Solution {
    public char slowestKey(int[] relT, String keysP) {

        int maxTime = relT[0];
        char maxCh = keysP.charAt(0);

        for(int i=1; i<relT.length; i++){

            int currentMaxTime = relT[i] - relT[i-1];
            char currCh = keysP.charAt(i);
            
            if(currentMaxTime > maxTime || currentMaxTime == maxTime && currCh > maxCh){
                maxTime = currentMaxTime;
                maxCh = currCh;
            }
        }
        return maxCh;
    }
}