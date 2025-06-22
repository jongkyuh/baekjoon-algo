import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<Character> skipChar = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char p : skip.toCharArray()){
            skipChar.add(p);
        }
        for(char c : s.toCharArray()){
            int count = 0;      
            char nextChar = c;
            while(count < index){
                nextChar++;
                if(nextChar > 'z'){
                    nextChar = 'a';                    
                }
                if(skipChar.contains(nextChar)){                        
                        continue;
                    }else{
                        
                        
                        count++;
                    }
               
                
            }
            sb.append(nextChar);
                
            
        }
        return sb.toString();
    }
}