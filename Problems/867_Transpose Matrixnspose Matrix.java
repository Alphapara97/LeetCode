class Solution {
    public int[][] transpose(int[][] matrix) {
        int i = matrix.length;
        int j = matrix[0].length;

        int[][] A = new int[j][i];

        for(int k = 0;k<i;k++){
            for(int l = 0;l<j;l++){
                A[l][k] = matrix[k][l];
            }

        }
        return A;
    }
}



//Runtime: 1 ms, faster than 52.16% of Java online submissions for Transpose Matrix.
//Memory Usage: 48.1 MB, less than 67.72% of Java online submissions for Transpose Matrix.