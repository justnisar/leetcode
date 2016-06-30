public class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s = new Stack<Integer>();
        
        int count = tokens.length;
        
        for(int i = 0 ; i < count ; i++){
            
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                    int a = s.pop();
                    int b = s.pop();
                    if(tokens[i].equals("+"))
                        s.push(b+a);
                    if(tokens[i].equals("-"))
                        s.push(b-a);
                    if(tokens[i].equals("*"))
                        s.push(b*a);
                    if(tokens[i].equals("/"))
                        s.push(b/a);
                        
            }
            else
                s.push(Integer.parseInt(tokens[i]));
            
            
        }
        return s.pop();
    }
}
