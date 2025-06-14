import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n : scoville){
            pq.add(n);
        }
        
        
        while(true){
            if(pq.size() == 1) break;
            
            boolean isBreak = true;
            for(int get : pq){
                if(get < K){
                    isBreak = false;
                    break;
                }
            }
            
            if(isBreak) break;
            else{                
                
                int num1 = pq.poll();
                int num2 = pq.poll();
                pq.add(num1 + num2 * 2);
                answer++;
            }
        }
        if(pq.poll() < K) return -1;
        return answer;
    }
}