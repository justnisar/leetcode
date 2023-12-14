package archived;

public class NumberComplement {
    public int findComplement(int num) {
        int number = 0;
        int count = 0;
        while(number < num){
            number = number + (int)Math.pow(2,count);
            count++;
        }
        return number - num;
        
    }
}
