class Solution {
public:
    bool isAnagram(string s, string t) {
        int alphabet[26] = {0};
        
        int len = s.length();
        for(int i = 0 ; i < len ; i++)
            alphabet[s[i] - 97]++;
        len = t.length();
        for(int i = 0 ; i < len ; i++)
            alphabet[t[i] - 97]--;
        for(int i = 0 ; i < 26 ; i++)
        if(alphabet[i] != 0)
            return false;
    return true;    
    }
};
