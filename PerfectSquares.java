public class Solution {

    public int numSquares(int n) {

        

        int[] array = new int[n + 1];

        

        array[0] = 0;

        array[1] = 1;

        

        for(int i = 2 ; i < n + 1 ; i++){

            int min = Integer.MAX_VALUE;

            for(int j = 1 ; j <= Math.sqrt(i) ; j++){

                int rem = i - (j * j);

                if(1 + array[rem] < min)

                    min = 1 + array[rem];

            }

            array[i] = min;

        }

        

        return array[n];

        

    }

}
