package archived;

public class Solution {

    public String simplifyPath(String path) {

        

        // Declare a stack

        Stack<String> stack = new Stack<String>();

        

        // Split the input string with '/' as delimiter

        String[] str_array = path.split("/");

        

        // extract the length of the array

        int length = str_array.length;

        

        // Iterate through the splitted array

        for(int i = 0 ; i < length ; i++){

            if(str_array[i].equals("..")){

                if(! stack.empty()){

                    stack.pop();

                }

            }

            else if(str_array[i].equals("")){

                continue;

            }

            else if(str_array[i].length() == 0){

                continue;

            }

            else{

                stack.push(str_array[i]);

            }

        }

        

        String result = "/";

        

        length = stack.size();

        

        for(int i = 0 ; i < length ; i++){

            result += stack.get(i);

            result += "/";

        }

        if(result.length() != 1)

         result = result.substring(0,result.length()-1);

        return result;

}

}
