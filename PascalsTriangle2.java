public class PascalsTriangle2 {
    
    public List<Integer> getRow(int rowIndex) {
        //if(rowIndex == 0)
          //  return null;
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        if(rowIndex == 0)
            return l;
        
        for(int i = 0 ; i < rowIndex ; i++){
            
            int size = l.size();
            for(int j = size - 1 ; j >= 1 ; j--)
                l.set(j,l.get(j) + l.get(j-1));
            l.add(1);
            
        }
        return l;
            
    }
}
