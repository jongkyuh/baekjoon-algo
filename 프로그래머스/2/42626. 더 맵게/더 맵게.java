import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : scoville) pq.add(n);
        
        while(true){
            if(pq.size() == 1){
                if(pq.poll() < K){
                    return -1;
                }else{
                    break;
                }
            }
            int first = pq.poll();  // 가장 작은 맵기
            if(first < K){
                int second = pq.poll();
                pq.add(first + (second * 2));
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}