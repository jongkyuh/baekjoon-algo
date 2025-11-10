import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int x = 0;
        int nonx = 0;
        
        char start = ' ';   
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(x == 0 && nonx == 0){
                start = current;
                sb.append(current+"");
               // continue;
            }
            
            if(start != current) nonx++;
            else x++;
            
            if(x == nonx){
                answer++;
                x = nonx = 0;
                sb = new StringBuilder();
                
            }
        }
        
        if(!sb.toString().equals("")) answer++;
        
        return answer;
    }
}