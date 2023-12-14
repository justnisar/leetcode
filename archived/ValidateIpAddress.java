package archived;

public class ValidateIpAddress {
  public boolean isIpv4(String str){
		
		String[] str_arr = str.split("\\.");
		int length = str.length();
		if(length == 0)
		    return false;
		char ch = str.charAt(length - 1);
		if(ch == '.')
			return false;
		length = str_arr.length;
			if(length != 4)
			return false;
		for(int i = 0 ; i < length ; i++){
			String s = str_arr[i];
			int len = s.length();
			if(len == 0 || len > 3)
				return false;
			
			for(int j = 0 ; j < len ; j++){
				ch = s.charAt(j);
				if(ch == '0' && j == 0 && j+1 != len)
				    return false;
				if(!(ch >= 48 && ch <= 57))
					return false;
			}
			int num = Integer.parseInt(s);
			if(num < 0 || num > 255)
				return false;
			
		}
		
		return true;
	}
	
	public boolean isIpv6(String str){
		String[] str_arr = str.split(":");
		int length = str.length();
		if(length == 0)
		    return false;
		char ch = str.charAt(length - 1);
		length = str_arr.length;
		if(ch == ':')
			return false;
		
		//System.out.println("Array Length : " + length);
		if(length != 8)
			return false;
		for(int i = 0 ; i < length ; i++){
			String s = str_arr[i];
			//System.out.print("Word : " + s);
			int len = s.length();
			//System.out.println(" Length : " + len);
			if(len > 4 || len == 0)
				return false;
			for(int j = 0 ; j < len ; j++){
				ch = s.charAt(j);
				if( !((ch >= 48  && ch <= 57) || (ch >= 97 && ch <= 102) || (ch >= 65 && ch <= 70)) )
					return false;
			}
		}
		
		return true;
	}
	
	public String validIPAddress(String IP) {
        if(isIpv4(IP))
        	return "IPv4";
        if(isIpv6(IP))
        	return "IPv6";
        return "Neither";
    }
}