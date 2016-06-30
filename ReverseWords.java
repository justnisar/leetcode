public class ReverseWords {
    public String reverseWords(String s) {
        
        // Output string
        StringBuffer output = new StringBuffer();
        
        s = s.trim();
        
        // Split the string into words
        String str[] = s.split(" ");
        
        // Reverse each word in the splitted array
        for(int i = 0 ; i < str.length ;i++){
            if(!str[i].equals("")){
            String strtmp = str[i].trim();
            StringBuffer temp = new StringBuffer(strtmp);
            temp = temp.reverse();
            output = output.append(temp);
            output = output.append(" ");
            }
        }
        
        return output.reverse().toString().trim();
        
    }
}
