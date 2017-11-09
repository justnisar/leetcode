class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int length = bits.length;
        if(length == 1)
            return true;
        int i = 0;
        while(i != length - 1 && i != length){
            if(bits[i] == 1)
                i += 2;
            else
               i++; 
        }
        
        if(i == length - 1)
            return true;
        return false;
    }
}
