package archived;

public class BulbSwitcher {
    public int bulbSwitch(int n) {
        if(n == 1)
            return 1;
        int count = 0;
        for(int i = 1 ; i < n; i++){
            if(i * i <= n)
                count++;
            else
                break;
        }
        return count;
        }
    }

