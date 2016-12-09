public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int i = 0 , j = 0;
        // check for rows and columns
        for(i = 0 ; i < 9 ; i++){
            HashSet<Character> hs1 = new HashSet<Character>();
           
            for(j = 0 ; j < 9 ; j++){
                char ch1 = board[i][j];
                
                // check for rows
                if(ch1 == '.'){
                    continue;
                }
                else if(!hs1.contains(ch1)){
                    hs1.add(ch1);
                }
                else{
                    return false;
                }
               
                
            }
            hs1.clear();

        }
        
        // check for rows and columns
        for(i = 0 ; i < 9 ; i++){
            HashSet<Character> hs2 = new HashSet<Character>();
           
            for(j = 0 ; j < 9 ; j++){
                char ch2 = board[j][i];
                
                // check for rows
                if(ch2 == '.'){
                    continue;
                }
                else if(!hs2.contains(ch2)){
                    hs2.add(ch2);
                }
                else{
                    return false;
                }
               
                
            }
            hs2.clear();

        }
        
        // check for boxes
        int a = 0,b = 0;
        
        for(a = 0 ; a < 9 ; a += 3){
            for(b = 0 ; b < 9 ; b += 3){
                HashSet<Character> hs3 = new HashSet<Character>();
                for(i = a ; i < a + 3 ; i++){
                    for(j = b ; j < b + 3 ; j++){
                        char ch = board[i][j];
                        if(ch == '.'){
                            continue;
                        }
                        else if(!hs3.contains(ch)){
                            hs3.add(ch);
                        }
                        else{
                            return false;
                        }
                        
                        
                    }
                }
                hs3.clear();
            }
        }
        
        return true;
    }
}