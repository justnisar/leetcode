package archived;

public class FindAllAnagramsInAString {

    public boolean isAnagram(String x,String y){

        int array[] = new int[26];

        for(int i = 0 ; i < x.length() ; i++){

            array[x.charAt(i) - 97]++;

        }

        for(int i = 0 ; i < y.length() ; i++){

            array[y.charAt(i) - 97]--;

        }

        for(int i = 0 ; i < 26 ; i++){

            if(array[i] != 0)

                return false;

        }

        return true;

    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<Integer>();

        if(p.length() > s.length())

            return result;

        int n = s.length() - p.length() + 1;

        int length = p.length();

        for(int i = 0 ; i < n ; i++){

            String str = s.substring(i,i+length);

            if(isAnagram(p,str))

                result.add(i);

        }

        return result;

        

    }

}
