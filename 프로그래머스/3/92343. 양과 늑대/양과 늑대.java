import java.util.*;

class Solution {
    static int max = 0; // 최대 양의 수 저장
    static Map<Integer, List<Integer>> edgeMap; // 연결정보
    
    static void dfs(int[] info, List<Integer> nextList, int sheep, int wolf){
        if(sheep <= wolf) return;   // 양의수가 적거나 같으면 종료
        
        max = Math.max(max, sheep); // 최대 양의 수 갱신 
        
        for(int i = 0; i < nextList.size(); i++){
            int cur = nextList.get(i);            
            List<Integer> newList = new ArrayList<>(nextList);
            
            newList.remove(i);  // 현재 방문할 노드는 제거            
            
            if(edgeMap.containsKey(cur)){
                newList.addAll(edgeMap.get(cur));   // 다음 노드들도 방문할 수 있는 상태, 추가하기
            }          
                       
            
            
            if(info[cur] == 0){
                dfs(info, newList, sheep + 1, wolf);
            }else{
                dfs(info, newList, sheep, wolf + 1);
            }
        }
        
        
        
        
    }
    public int solution(int[] info, int[][] edges) {
        int answer = 0;
        edgeMap = new HashMap<>();
        for(int[] edge : edges){    // map 초기화
            int edge1 = edge[0];
            int edge2 = edge[1];
            edgeMap.computeIfAbsent(edge1, k -> new ArrayList<>())
                    .add(edge2);
        }
        
        List<Integer> firstList = new ArrayList<>();
        
        firstList.addAll(edgeMap.get(0));
        dfs(info, firstList, 1, 0);
        
        answer = max;
        
        return answer;
    }
}