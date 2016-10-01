public class Solution {

    

    public int getMin(int m,int n){

        if(m < n)

            return m;

        return n;

    }

    

    public String getHint(String secret, String guess) {

        

        int[] array1 = new int[10];

        int[] array2 = new int[10];

        

        int count1 = 0;

        int count2 = 0;

        

        int length = secret.length();

        

        for(int i = 0 ; i < length ; i++){

            if( secret.charAt(i) == guess.charAt(i) )

                count1++;

            else{

                array1[ secret.charAt(i) - 48]++;

                array2[ guess.charAt(i) - 48]++;

            }

        }

        

        for(int i = 0 ; i < 10 ; i++){

            count2 += getMin(array1[i],array2[i]);

        }

        

        //String result = "";

        return String.valueOf(count1) + "A" + String.valueOf(count2) + "B";

    }

}
