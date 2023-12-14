package archived;

public class CountPrimes {
	
	public int countPrimes(int n) {
		
		if(n <= 2)
			return 0;
		int count = 0;
		boolean[] array = new boolean[n];
        array[1] = true;
        int i,j;
        for(i = 2 ; i <= Math.sqrt(n) ; i++){
        	if(array[i] == true)
        		continue;
        	else{
        		for(j = 2 * i ; j < n ; j += i){
        			if(array[j] == true)
        				continue;
        			else
        				array[j] = true;
        		}
        	}
        }
        
        for(i = 1 ; i < n ; i++)
        	if(array[i] == false)
        		count++;
        
		
		return count;
    }
	
	
	public static void main(String args[]){
		CountPrimes obj = new CountPrimes();
		System.out.println(obj.countPrimes(25));
		
	}
}
