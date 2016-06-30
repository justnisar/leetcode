class Solution {
public:
    bool isPalindrome(string s) {
        int i = 0;
        int len = s.length();
        int j = len - 1;
        
        while(i < j ){
            while ( i < len && !( (s[i] >= 65 && s[i] <= 90)|| (s[i] >= 97 && s[i] <= 122) ||(s[i] >= 48 && s[i] <= 57) ) )
                i++;
            while ( j>=0 &&  !( (s[j] >= 65 && s[j] <= 90)|| (s[j] >= 97 && s[j] <= 122) || (s[j] >= 48 && s[j] <= 57) ) )
                j--;
            //cout<<i<<" "<<j<<endl;
            
            if(i > j)
                break;
            
            if(s[i] >= 65 && s[i] <= 90)
                s[i] = s[i] + 32;
            if(s[j] >= 65 && s[j] <= 90)
                s[j] = s[j] + 32;
                
            if(s[i] != s[j])
                return false;
            i++;
            j--;
                
        }

        return true;
    }
    
    
};



