import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char c : arr){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek() == c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        
        

        return stack.isEmpty() ? 1 : 0;
    }
}