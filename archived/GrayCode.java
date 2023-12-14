package archived;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        n = 1 << n;
        for(int i = 0 ; i < n ; i++){
            int temp = i ^ (i >> 1);
            result.add(temp);
        }
        return result;
    }
}
