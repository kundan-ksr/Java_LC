//Brute Force approach-

// class Solution {
//     public double myPow(double x, int n) {
//         double ans = 1;
//         boolean isNeg = n < 0;
//         if(isNeg){
//             ans = myPowHelper(x, -n);
//             return 1/ans;
//         }
//         ans = myPowHelper(x, n);
//         return ans;
//     }
    
//     //Helper function to calculate the power-
//     private double myPowHelper(double x, int n){
//         if(n == 0){
//             return 1;
//         }
//         return x * myPowHelper(x, n-1);
//     }
// }

// Optimized approach

class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n; //keeping n safe and using nn for use;

        if(nn < 0) nn *= -1; //if n is negative making it positive for calculation, -ve part will be handled at returning.

        while(nn > 0){
            //Odd case-
            if((nn % 2) == 1){
                ans = ans * x;
                nn = nn - 1;
            }
            else{
                x = x * x;
                nn = nn /2;
            }
        }
        if(n<0) ans = (double)(1.0) / (double)(ans); //using the above n to check if the original number was -ve;
        // as 2^(-5) = 1/2^(-5);
        return ans;
    }
}