import java.util.*;

class Solution {
    static void bfs(int[][] computers, int start,  boolean[] visit){
        Deque<Integer> q = new ArrayDeque<>();
        q.addLast(start);
        visit[start] = true;
    
        while(!q.isEmpty()){
            int pollNum = q.pollFirst();
            
            for(int i = 0; i < computers.length; i++){
                if(computers[pollNum][i] == 1 && visit[i] == false){
                    visit[i] = true;
                    q.addLast(i);
                }
            }
            
        }
        
        
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visit[i]){
                bfs(computers, i, visit);
                answer++;
            }
        }
        return answer;
    }
}