public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuffer a = new StringBuffer(num1);
        StringBuffer b = new StringBuffer(num2);
        a = a.reverse();
        b = b.reverse();
        
        StringBuffer result = new StringBuffer();
        
        int i=0,j=0;
        int length1 = a.length();
        int length2 = b.length();
        int carry = 0;
        int sum = 0;
        int ch1 = 0, ch2 = 0;
        while(i < length1 && j < length2){
            
            ch1 = a.charAt(i) - 48;
            ch2 = b.charAt(j) - 48;
            
            sum = ch1 + ch2 + carry;
            
            if(sum <= 9){
                carry = 0;
            }
            else{
                carry = 1;
            }
            sum = sum % 10;
            char ch = (char)(sum+48);
            result.append(ch);
            i++;
            j++;
        }
        
        while(i < length1){
            ch1 = a.charAt(i) - 48;
            sum = ch1 + carry;
            if(sum <= 9){
                carry = 0;
            }
            else{
                carry = 1;
            }
            sum = sum % 10;
            result.append((char)(sum+48));
            i++;
        }
        
        while(j < length2){
            ch2 = b.charAt(j) - 48;
            sum = ch2 + carry;
            if(sum <= 9){
                carry = 0;
            }
            else{
                carry = 1;
            }
            sum = sum % 10;
            result.append((char)(sum+48));
            j++;
        }
        
        if(carry == 1)
            result.append('1');
        
        return result.reverse().toString();
    }
}