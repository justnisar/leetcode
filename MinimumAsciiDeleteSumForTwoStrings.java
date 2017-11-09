class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int rows = s1.length() + 1;
        int columns = s2.length() + 1;
        int[][] array = new int[rows][columns];
        for(int i = 1 ; i < rows ; i++)
            array[i][0] = array[i - 1][0] + s1.charAt(i - 1);
        for(int i = 1 ; i < columns ; i++)
            array[0][i] = array[0][i - 1] + s2.charAt(i - 1);
        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < columns ; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1))
                    array[i][j] = array[i - 1][j - 1];
                else
                    array[i][j] = Math.min(array[i][j - 1] + s2.charAt(j - 1), array[i - 1][j] + s1.charAt(i - 1));
            }
        }
        return array[rows - 1][columns - 1];
    }
}
