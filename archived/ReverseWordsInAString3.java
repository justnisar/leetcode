package archived;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str_arr = s.split(" ");
        String result = "";
        int length = str_arr.length;
        for(int i = 0 ; i < length ; i++){
            StringBuffer strBuffer = new StringBuffer(str_arr[i]);
            strBuffer.reverse();
            result += strBuffer.toString();
            if(i != length - 1)
                result += " ";
        }
        return result;
    }
}
