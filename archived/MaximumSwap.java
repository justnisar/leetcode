package archived;

class Solution {
    public int getValue(List<Integer> list){
        int result = 0;
        for(int i = 0 ; i < list.size() ; i++)
            result += list.get(i) * (int)Math.pow(10,i);

        return result;
    }
    public int maximumSwap(int num) {
        List<Integer> list = new ArrayList<Integer>();
        while(num != 0){
            int remainder = num % 10;
            list.add(remainder);
            num /= 10;
        }
        int location = 0;
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            int max = list.get(i);
            for(int j = i - 1 ; j >= 0 ; j--){
                if(list.get(j) >= max){
                    max = list.get(j);
                    location = j;
                }    
            }
            if(max != list.get(i)){
                int temp = list.get(location);
                list.set(location,list.get(i));
                list.set(i,temp);
                return getValue(list);
            }
        }
        return getValue(list);
    }
}
