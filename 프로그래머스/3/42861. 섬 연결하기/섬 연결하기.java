import java.util.*;

class Solution {
    static int[] islands;
    static int find(int x){
        if(islands[x] == x) return islands[x];
        return islands[x] = find(islands[x]);
    }
    
    static void union(int x, int y){
        int a = find(x);
        int b = find(y);
        
        islands[a] = b;
    }
    public int solution(int n, int[][] costs) {
        int answer = 0;
        Arrays.sort(costs, (a,b) -> {
             return Integer.compare(a[2], b[2]);
        });
        int nodes = 0;
        islands = new int[n];
        for(int i = 0; i < islands.length; i++){
            islands[i] = i;
        }
        for(int i = 0; i < costs.length; i++){
            if(nodes == n-1) break;
            int a = costs[i][0];
            int b = costs[i][1];
            if(find(a) != find(b)){
                union(a,b);
                answer += costs[i][2];
                nodes++;
            }
        }
        
        return answer;
    }
}