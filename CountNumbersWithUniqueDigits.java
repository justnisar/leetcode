public class Solution {

    public int countNumbersWithUniqueDigits(int n) {

        

        int array[] = new int[11];

        

        array[0] = 1;

        array[1] = 9;

        

        

        for(int i = 2 ; i < 11 ; i++){

            array[i] = (11 - i) * array[i - 1];    

        }

        

        if(n > 10)

            n = 10;

        

        int result = 0;

        for(int i = 0 ; i <= n ; i++)

            result += array[i];

            

        

        return result;

    }

}
