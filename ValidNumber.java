public class ValidNumber {
    private int ePosition;
	public Solution(){
		ePosition = -1;
	}
	
	// Check for count of legal characters
	public boolean countCheck(String str){
		int length = str.length();
		int eCount = 0;
		int dotCount = 0;
		int mCount = 0;
		int pCount = 0;
		for(int i = 0 ; i < length ; i++){
			char ch = str.charAt(i);
			if(ch == 'e'){
				eCount++;
				ePosition = i;
			}
			if(ch == '.')
				dotCount++;
			if(ch == '-')
				mCount++;
			if(ch == '+')
				pCount++;
			if(eCount > 1)
				return false;
			if(dotCount > 1)
				return false;
			if(mCount > 2)
				return false;
			if(pCount > 2)
				return false;
		}
		return true;
	}
	
	// Check for illegal characters in number
	public boolean sanityCheck(String str){
		int length = str.length();
		for(int i = 0 ; i < length ; i++){
			char ch = str.charAt(i);
			if(!((ch >= 48 && ch <= 57) || ch == '.' || ch == 'e' || ch == '-' || ch == '+'))
				return false;
		}
		return true;
	}
	
	public boolean checkDigits(String str){
	    int length = str.length();
	    for(int i = 0 ; i < length ; i++){
	        char ch = str.charAt(i);
	        if(ch >= 48 && ch <= 57)
	            return true;
	    }
	    return false;
	}
	
	// Check if number is valid integer
	public boolean isInteger(String str){
		char ch = str.charAt(0);
		if(ch == '.')
			return false;
		int length = str.length();
		if(length == 1 && !(ch >= 48 && ch <= 57) )
		    return false;
		for(int i = 1 ; i < length ; i++){
			ch = str.charAt(i);
			if(!(ch >= 48 && ch <= 57))
				return false;
		}
		return true;
	}
	
	// Check if number is valid float
	public boolean isFloat(String str){
		char ch = str.charAt(0);
		int length = str.length();
		int dotCount = 0;
		if(length == 1 && !(ch >= 48 && ch <= 57) )
		    return false;
		for(int i = 1 ; i < length ; i++){
			ch = str.charAt(i);
			if(!(ch >= 48 && ch <= 57)){
				if(ch == '+' || ch == '-')
					return false;
				if(ch == '.')
					dotCount++;
				if(dotCount > 1)
					return false;
			}
		}
		return true  && checkDigits(str);
	}
	
	// Check for additional issues in the number
	public boolean additionalCheck(String str){
		if(ePosition == -1){
			return isFloat(str);
		}
		if(ePosition == 0 || ePosition == str.length() - 1){
			return false;
		}
		String[] str_arr = str.split("e");
		return isFloat(str_arr[0]) && isInteger(str_arr[1]);
	}
	
	public boolean isNumber(String s) {
        
		s = s.trim().toLowerCase();
		if(s.length() == 0)
		    return false;
    	return sanityCheck(s) && countCheck(s) && additionalCheck(s);
    }

}
