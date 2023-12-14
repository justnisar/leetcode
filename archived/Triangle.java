package archived;
import java.util.*;
public class Triangle {
	
	public int getMin(int x,int y){
		if(x < y)
			return x;
		return y;
	}
	
	public int minimumTotal(List<List<Integer>> triangle) {
        //int min = Integer.MAX_VALUE;
        int length = triangle.size();
        for(int i = length - 2 ; i >= 0 ; i--){
        	
        	List<Integer> al = triangle.get(i);
        	int length1 = al.size();
        	for(int j = 0 ; j < length1 ; j++){
        		int x = al.get(j) + triangle.get(i+1).get(j);
        		int y = al.get(j) + traingle.get(i+1).get(j+1);
        		int min = getMin(x,y);
        		al.set(j,min);
        	}
        	return triangle.get(0).get(0);
        }
		
		
    }

	
}
