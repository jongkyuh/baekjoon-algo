import java.util.*;

class Solution {
    
    static Queue<Integer> q = new ArrayDeque<>(); // 진행큐
    static List<Integer> list = new ArrayList<>(); // 단계마다 갯수 넣기 
    static Map<Integer, List<Integer>> map = new HashMap<>();    // 관계 정리하기 
    static boolean[] visit; // 방문배열, 인덱스가 아니라 1부터 시작이라 크기하나 증가     
    
    static void queueArrange(Queue<Integer> q){
        if(q.isEmpty()) return ;    // 큐가 비었을 경우 
        
        int firstQsize = q.size();  //
        
        for(int i = 0; i < firstQsize; i++){  // 큐 사이즈 만큼 반복
            List<Integer> pollList = new ArrayList<>(map.getOrDefault(q.poll(), new ArrayList<>()));    
            for(int pollNum : pollList){
                if(!visit[pollNum]){
                    q.add(pollNum);
                    visit[pollNum] = true;
                }
            }              
            
        }
        
    }
    public int solution(int n, int[][] edge) {
        int answer = 0;

        visit = new boolean[n+1]; // 방문배열, 인덱스가 아니라 1부터 시작이라 크기하나 증가 
        
        for(int[] arr : edge){
            map.computeIfAbsent(arr[0], k -> new ArrayList<>()).add(arr[1]);
            map.computeIfAbsent(arr[1], k -> new ArrayList<>()).add(arr[0]);
        }
        
        q.add(1);
        visit[1] = true;
        list.add(1);
        
        
        while(!q.isEmpty()){
            queueArrange(q);
            if(q.isEmpty()) list.add(0);                
            else list.add(q.size());                
            

        }
        return list.get(list.size() - 2);
    }
}