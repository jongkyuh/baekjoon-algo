import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else{
                if(!stack.isEmpty()){
                    if(stack.peek() == '(') stack.pop();
                    else stack.push(c);
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty() ? true : false;
    }
}