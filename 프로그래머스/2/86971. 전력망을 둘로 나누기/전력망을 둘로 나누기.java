import java.util.*;

class Solution {
    static List<Integer>[] list;
    static int answer = Integer.MAX_VALUE;
    static boolean[] visit;
    static int count = 0;
    static void find(int k){
        if(visit[k]) return;
        
        visit[k] = true;
        count++;
        for(int num : list[k]){
            if(!visit[num]){
                //visit[num] = true;
                find(num);
            }
        }
    }
    public int solution(int n, int[][] wires) {        
        
        for(int i = 0; i < wires.length; i++){
            list = new ArrayList[n+1];
            visit = new boolean[n+1];
            for(int j = 0; j < n+1; j++){
                list[j] = new ArrayList<>();
            }
            for(int k = 0; k < wires.length; k++){
                if(i == k)continue;
                list[wires[k][0]].add(wires[k][1]);
                list[wires[k][1]].add(wires[k][0]);
            }
            // 여 기
            find(wires[i][0]);
            int cha2 = Math.abs(count - (n - count));
            answer = Math.min(answer, cha2);
            count = 0;
        }
        return answer;
    }
}