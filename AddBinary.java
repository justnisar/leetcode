public class AddBinary {
    public String addBinary(String a, String b) {
        
        StringBuffer num1 = new StringBuffer(a);
        StringBuffer num2 = new StringBuffer(b);
        
        num1 = num1.reverse();
        num2 = num2.reverse();
        
        int length1 = num1.length();
        int length2 = num2.length();
        
        int i = 0 , j = 0;
        
        StringBuffer result = new StringBuffer();
        int carry = 0;
        
        while(i < length1 && j < length2){
            int ch1 = num1.charAt(i) - 48;
            int ch2 = num2.charAt(j) - 48;
            int sum = ch1 + ch2 + carry;
            if(sum == 0){
                result.append('0');
                carry = 0;
            }
            else if(sum == 1){
                result.append('1');
                carry = 0;
            }
            else if(sum == 2){
                result.append('0');
                carry = 1;
            }
            else{
                result.append('1');
                carry = 1;
            }
            i++;
            j++;
        }
        
        while(i < length1){
            int ch = num1.charAt(i) - 48;
            int sum = ch + carry;
            if(sum == 0){
                result.append('0');
                carry = 0;
            }
            else if(sum == 1){
                result.append('1');
                carry = 0;
            }
            else if(sum == 2){
                result.append('0');
                carry = 1;
            }
            else{
                result.append('1');
                carry = 1;
            }
            i++;
        }
        
        while(j < length2){
            int ch = num2.charAt(j) - 48;
            int sum = ch + carry;
            if(sum == 0){
                result.append('0');
                carry = 0;
            }
            else if(sum == 1){
                result.append('1');
                carry = 0;
            }
            else if(sum == 2){
                result.append('0');
                carry = 1;
            }
            else{
                result.append('1');
                carry = 1;
            }
            j++;
        }
        
        if(carry == 1)
            result.append('1');
            
        return result.reverse().toString();
        
           
    }
}