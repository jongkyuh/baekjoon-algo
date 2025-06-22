import java.util.*;

class Solution {
    public int solution(int[] order) {
        int result = 0;
        // 택배기사 요구순서: 4 3 1 2 5  -> for문 순회 방식 
        // 컨베이어 벨트는 1 ~ n 순서대로 하나씩 가능 ->  큐에 하나씩 저장 해놓는다. 
        // 보조 컨베이어 벨트는 마지막에 넣은걸 먼저 뺀다 -> 스택구조 
        
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();  // 1. 보조 컨베이어 벨트 
        for(int i = 1; i <= 1000000; i++){  // 2. 큐에 하나씩 저장 해놓는다.  
            q.add(i);
        }
        
        for(int orderNum : order){
            while(!q.isEmpty() &&q.peek() < orderNum ){ // 큐의 숫자를 주문번호보다 적은건 보조 컨베이어벨트로 먼저 옮긴다
                stack.push(q.poll());
            }
            
            if((!q.isEmpty() && q.peek() != orderNum) && (!stack.isEmpty() &&stack.peek() != orderNum)){
                break;
            }
            
            if( !q.isEmpty() && q.peek() == orderNum){
                result++;
                q.poll();
                continue;
            }
            
            if(!stack.isEmpty() && stack.peek() == orderNum){
                result++;
                stack.pop();
                continue;
            }
            
            
        }
        
        
        
        
        return result;
    }
}