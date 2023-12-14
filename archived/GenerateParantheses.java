package archived;

public class GenerateParantheses {
    List<String> l;
    public Solution(){
        l = new ArrayList<String>();
    }
    public void recfun(int n,int open,int close,String str){
        if(open == n && close == n){
            l.add(str);
            return;
        }
        if(open < n){
            str += '(';
            ++open;
            recfun(n,open,close,str);
            --open;
            str = str.substring(0,str.length() - 1);
        }
        if(open > close){
            str += ')';
            ++close;
            recfun(n,open,close,str);
            --close;
            str = str.substring(0,str.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        String str = "";
        recfun(n,0,0,str);
        return l;
    }
}
