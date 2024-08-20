/*here we are iterating over the matrix and checking whether the array[i][j] contains any 0,
    if it contains any 0 then accordingly we update the row and col matrix value to 1 so that after
    iteration of the whole matrix we can change the value of the whole matrix to 0;

    the extra row and column is used so that we do not overwrite the matrix.
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}