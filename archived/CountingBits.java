package archived;

public class CountingBits {
    
    public static int fun(int n){
		double d = (double)n;
		if( Math.ceil(Math.log(d)/Math.log(2)) - Math.floor(Math.log(d)/Math.log(2)) == 0){
			return n; 
		}
		else{
			return (int)Math.round(Math.pow(2,Math.floor(Math.log(n)/Math.log(2))));
		}
	}
    
    public int[] countBits(int num) {
        int []array = new int[num+1];
        for(int i = 0 ; i < num + 1 ; i++){
            if(i == 0 || i == 1){
                array[i] = i;
            }
            else{
                int nearest = fun(i);
                array[i] = 1 + array[i - nearest];
            }
        }
        
        return array;
    }
}
