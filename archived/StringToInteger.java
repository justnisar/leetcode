package archived;

public class StringToInteger {
    	public String extractNumber(String str){
    	str = str.trim();
    	int length = str.length();
    	String result = "";
    	if(length == 0)
    		return "";
    	char ch;
    	ch = str.charAt(0);
    	if( !(ch == '+' || ch == '-' || (ch >= 48 && ch <= 57))){
    		return "";
    	}
    	result += ch;
    	for(int i = 1 ; i < length ; i++){
    		ch = str.charAt(i);
    		if( !(ch >= 48 && ch <= 57) )
    			break;
    		result += ch;
    	}
    	return result;
    }
    
	public int computeResult(String str){
		int length = str.length();
		int result = 0;
		if(length == 0 || str.equals("+") || str.equals("-"))
			return 0;
		char ch = str.charAt(0);
		boolean isNegative = false;
		int start = 0;
		if(ch == '-'){
			isNegative = true;
			start = 1;
		}
		if(ch == '+')
			start = 1;
		int power = 0;
		for(int i = length - 1 ; i >= start ; i--){
			ch = str.charAt(i);
			
			if(isNegative)
				result -= (ch - 48) * Math.pow(10,power);
			else
				result += (ch - 48) * Math.pow(10,power);
			
			
			
			if(isNegative && result > 0)
				return Integer.MIN_VALUE;
			if(!isNegative && result < 0)
				return Integer.MAX_VALUE;
			power++;
		}
		
		return result;
	}
	
	public int myAtoi(String str) {
		str = extractNumber(str);
		return computeResult(str);
    }
}