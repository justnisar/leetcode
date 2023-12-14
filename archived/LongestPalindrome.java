package archived;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        int[] array = new int[52];
        
        int length = s.length();
        
        for(int i = 0 ; i < length ; i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                array[ch-65]++;
            }
            if(ch >= 97 && ch <= 122){
                array[ch-71]++;
            }
        }
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0 ; i < 52 ; i++){
            if(array[i] % 2 == 1){
                if(array[i] > max)
                    max = array[i];
            }
        }
        
        for(int i = 0 ; i < 52 ; i++){
            if(array[i] == max){
                sum += array[i];
                array[i] = 0;
                break;
            }
        }
        
        for(int i = 0 ; i < 52 ; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
            else{
                sum = sum + array[i] - 1;
            }

        }
        
        
        
        return sum;
        
    }
}