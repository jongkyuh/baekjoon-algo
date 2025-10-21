import java.util.*;

class Solution {
    
    static class Node{
        int idx;
        int priorities;
        public Node(int idx, int priorities){
            this.idx = idx;
            this.priorities = priorities;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Node> q = new ArrayDeque<>(); // 우선순위 
        
        for(int i = 0; i < priorities.length; i++){
            q.add(new Node(i, priorities[i]));
        }
        while(!q.isEmpty()){
            int max = 0;
            for(Node node : q){
                max = Math.max(node.priorities, max);
            }
            
            if(q.peek().priorities != max){ // 우선순위 안맞을 때  
                q.add(q.poll());                
            }else{
                Node pollNode = q.poll();
                answer++;
                if(location == pollNode.idx){
                    return answer;
                }else{
                    continue;
                }
            }
        }
        return answer;
    }
}