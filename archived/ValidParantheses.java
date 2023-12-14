package archived;

public class ValidPalindrome {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<Character>();
        int len = s.length();
        int k;
        for(int i = 0 ; i < len ; i++){
            char ch = s.charAt(i);
            if(ch == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                k = ss.push(ch);
            else if(ch == ']'){
                if(ss.empty() == true)
                    return false;
                char c = ss.pop();
                if(c != '[')
                return false;
            }
            else if(ch == ')'){
                if(ss.empty() == true)
                    return false;
                char c = ss.pop();
                if(c != '(')
                return false;
            }
            else if(ch == '}'){
                if(ss.empty() == true)
                    return false;
                char c = ss.pop();
                if(c != '{')
                return false;
            }
        }
        if(ss.empty() == true)
        return true;
        return false;
    }
}
