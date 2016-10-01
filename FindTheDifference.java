public class Solution {

    public char findTheDifference(String s, String t) {

        

        int l1 = s.length();

        int l2 = t.length();

      

        int[] array = new int[26];

        

        for(int i = 0 ; i < l1 ; i++){

            array[s.charAt(i) - 97]++;

        }

        

        for(int i = 0 ; i < l2 ; i++){

            array[t.charAt(i) - 97]--;

        }

        

        for(int i = 0 ; i < 26 ; i++){

            if(array[i] != 0)

                return (char)(i+97);

        }

     

     return 'a';   

    }

}
