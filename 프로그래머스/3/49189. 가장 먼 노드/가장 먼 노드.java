import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        // 큐
        Queue<Integer> q = new ArrayDeque<>();
        // 인접 노드 갯수 정보
        List<Integer> resultList = new ArrayList<>();
        // 방문 표시
        boolean[] visited = new boolean[n+1];
        
        List<List<Integer>> edges = new ArrayList<>();
        
        for(int i =0; i < n+1; i++){
            edges.add(new ArrayList<>());
        }
        
        for(int[] e : edge){
            int a = e[0];
            int b = e[1];
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        
        q.add(1);
        visited[1] = true;
        resultList.add(1);
        
        while(!q.isEmpty()){
            int num = 0; // 각 노드 단계당 사이즈 저장변수
            int size = q.size();
            for(int i = 0; i < size; i++){
                int pollNum = q.poll();
                for(int j = 0; j < edges.get(pollNum).size(); j++){
                    if(!visited[edges.get(pollNum).get(j)]){
                          q.add(edges.get(pollNum).get(j));
                    visited[edges.get(pollNum).get(j)] = true;
                    }
                  
                }
                
            }
            resultList.add(q.size());
        }
        
        return resultList.get(resultList.size()-2);
    }
}