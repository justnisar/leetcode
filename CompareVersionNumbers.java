public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        
        String[] array1 = version1.split("\\.");
        String[] array2 = version2.split("\\.");
        
        int length1 = array1.length;
        int length2 = array2.length;
        
        int i=0,j=0;
        for(i = length1 -1 ; i >= 0; i--){
            int x = Integer.parseInt(array1[i]);
            if(x == 0)
                length1--;
            else
                break;
        }
        
        for(j = length2 -1 ; j >= 0; j--){
            int x = Integer.parseInt(array2[j]);
            if(x == 0)
                length2--;
            else
                break;
        }
        
        i = 0;
        j = 0;
        while(i < length1 && j < length2){
            int x = Integer.parseInt(array1[i]);
            int y = Integer.parseInt(array2[j]);
            
            if(x < y)
                return -1;
            if(x > y)
                return 1;
            
            i++;
            j++;
        }
        
        if(i == length1 && j == length2)
            return 0;
        else if(i == length1)
            return -1;
        else
            return 1;
        
    }
}
