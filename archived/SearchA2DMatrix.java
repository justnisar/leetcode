package archived;

class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if(rows == 0)
            return false;
        int columns = matrix[0].length;
        int left = 0, right = columns - 1;
        while(left < rows && right >= 0){
            if(matrix[left][right] == target)
                return true;
            else if(matrix[left][right] > target)
                right--;
            else
                left++;
        }
        return false;
    }
}
