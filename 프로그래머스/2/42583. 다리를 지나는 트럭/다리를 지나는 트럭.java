import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        // 큐(다리역할)
        Queue<Integer> q = new ArrayDeque<>();
    
        // 다리 최대 허용 수  - 1만큼 0으로 채우기
        // 그래야 후에 poll할 때 다리 길이의 효과가 일어남 
        for(int i = 0; i < bridge_length - 1; i++){
            q.add(0);
        }
        // 처음 자동차 다리 진입
        q.add(truck_weights[0]);
        answer++;
        int idx = 1;
        int currentWeight = truck_weights[0];
        
        while(!q.isEmpty()){
            answer++;
            int remove = q.poll();
            currentWeight -= remove;
            
            if(idx < truck_weights.length){
                if(currentWeight + truck_weights[idx] <= weight){
                    currentWeight += truck_weights[idx];
                    q.add(truck_weights[idx]);
                    idx++;
                }else{
                    q.add(0);
                }
            }
        }
        return answer;
    }
}