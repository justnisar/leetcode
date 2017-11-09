class Solution {
    public int findLength(int[] A, int[] B) {
        if(A.length == 0 || B.length == 0)
            return 0;
        int max = 0;
        int[][] array = new int[A.length + 1][B.length + 1];
        for(int i = 1 ; i < A.length + 1 ; i++){
            for(int j = 1 ; j < B.length + 1 ; j++){
                if(A[i - 1] == B[j - 1])
                    array[i][j] = 1 + array[i - 1][j - 1];
                else
                    array[i][j] = 0;
                if(array[i][j] > max)
                    max = array[i][j];
            }
        }
        return max;
    }
}
