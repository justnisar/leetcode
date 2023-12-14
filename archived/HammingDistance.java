package archived;

public class HammingDistance {

    public int hammingDistance(int x, int y) {

     

     int result = 0;

     for(int i = 0 ; i < 32 ; i++){

         int p = x & 1;

         x = x >> 1;

         int q = y & 1;

         y = y >> 1;

         if(p != q)

            result += 1;

     }

        return result;

    }

}
