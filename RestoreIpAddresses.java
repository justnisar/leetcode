public class RestoreIpAddresses {
    public boolean isValid(String s){
		int length = s.length();
		if(length > 3 || length == 0 || (s.charAt(0) == '0' && length != 1) 
				|| Integer.parseInt(s) > 255)
			return false;
		return true;
	}
	
	
	public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        int length = s.length();
        for(int i = 1; i <= 3 ; i++){
        	for(int j = 1 ; j <= 3 ; j++){
        		for(int k = 1 ; k <= 3 ; k++){
        		    if(i > length)
        		        continue;
        			String s1 = s.substring(0, i);
        			if(i + j > length)
        		        continue;
        			String s2 = s.substring(i,i + j);
        			if(i + j + k > length)
        		        continue;
        			String s3 = s.substring(i + j, i + j + k);
        			String s4 = s.substring(i + j + k,length);
        			if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4))
        			    result.add(s1 + "." + s2 + "." + s3 + "." + s4);
        		}
        	}
        }
        
        return result;
    }

}
