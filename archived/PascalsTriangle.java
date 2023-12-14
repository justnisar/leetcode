package archived;

public class PascalsTriangle {
    List<List<Integer>> l;
    public Solution(){
        l = new ArrayList<List<Integer>>();
    }
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        if(n == 0)
            return l;
        List ll;
        ll = new ArrayList<Integer>();
        ll.add(1);
        l.add(ll);
        if(n == 1)
            return l; 
        
        for(int i = 1 ; i < n ; i++){
            ll = new ArrayList<Integer>();
            List<Integer> x = l.get(i-1);
            int count = x.size();
            ll.add(1);
            for(int j = 0 ; j < count - 1; j++){
                int k = x.get(j) + x.get(j+1);
                ll.add(k);
            }
            ll.add(1);
            l.add(ll);
        } 
       return l;
    }
}
