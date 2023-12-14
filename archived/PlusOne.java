package archived;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = digits.length - 1 ; i >= 0 ; i--){
            int x = digits[i] + carry;
            if(x > 9){
                carry = 1;
                al.add(x % 10);
            }
            else{
                al.add(x);
                carry = 0;
            }
        }
        
        if(carry == 1)
            al.add(1);
            
        //Collections.reverse(al);
        
        int[] result = new int[al.size()];
        
        int index = 0;
        for(int i = al.size() - 1 ; i >= 0 ; i-- ){
            result[index] = al.get(i); 
            index++;
        }
            
        return result;
    }
}
