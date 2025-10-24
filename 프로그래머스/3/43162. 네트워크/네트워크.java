import java.util.*;

class Solution {
    static boolean[] visit; // 방문 배열(공유)
    static Queue<Integer> q = new ArrayDeque<>();
    
    static void dfs(int[][] computers, int start){
        q.add(start);
        visit[start] = true;    // 방문 표시 
        while(!q.isEmpty()){
           int pollNum = q.poll(); // 큐에서 데이터 가져옴
        
        for(int i = 0; i < visit.length; i++){
            if(!visit[i] && computers[pollNum][i] == 1){
                q.add(i);
                visit[i] = true;
            }
        } 
        }
        
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit= new boolean[computers.length];
        for(int i = 0; i < n; i++){
            if(!visit[i]){
                dfs(computers, i);
                answer++;
            }
            
        }
        return answer;
    }
}