package archived;/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
     int low = 1;
     int high = n;
     while(low <= high){
         int mid = low + (high - low + 1)/2;
         boolean val1 = isBadVersion(mid);
         boolean val2 = isBadVersion(mid - 1);
         
         if(val1 && val2)
            high = mid - 1;
         else if(val1 == true && val2 == false)
            return mid;
         else if(val1 == false)
            low = mid + 1;
     }
     return 1;
    }
}
