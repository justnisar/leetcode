public class Solution {

    

    List< List<Integer> > result;

    

    public void recfun(int x,int y,int start,int end,ArrayList<Integer> al){

        

        

        if(x == y){

            ArrayList<Integer> temp = new ArrayList<Integer>(al);

            result.add(temp);

            return;

        }

        

        ArrayList<Integer> all = new ArrayList<Integer>(al);

        

        for(int i = start; i <= end ; i++){

            all.add(i);

            recfun(x+1,y,i+1,end,all);

            all.remove(all.size() - 1);

        }

                

    }

    

    public List<List<Integer>> combine(int n, int k) {

        

        result = new ArrayList< List<Integer> >();

        

        ArrayList<Integer> al = new ArrayList<Integer>();

        

        recfun(0,k,1,n,al);

        

        return result;    

    }

}
