import java.util.*;

class Solution {
    static int answer = Integer.MAX_VALUE;
    static int[][] dist;
    static int[] addX = new int[]{-1, 0, 1, 0};
    static int[] addY = new int[]{0, 1, 0, -1};
    
    static void bfs(Queue<int[]> q, int[][] maps, int[][] dist){
        while(!q.isEmpty()){
            int[] pollArr = q.poll();
            for(int i = 0; i < 4; i++){
                int nextX = pollArr[0] + addX[i];
                int nextY = pollArr[1] + addY[i];
                if(nextX >= 0 && nextX < maps.length &&
                   nextY >= 0 && nextY < maps[0].length){
                   if(maps[nextX][nextY] == 1 && dist[nextX][nextY]==0){
                       q.add(new int[]{nextX, nextY});
                       dist[nextX][nextY] = dist[pollArr[0]][pollArr[1]] + 1;
                   }
                }
            }
        }
    }
    public int solution(int[][] maps) {
        // maps 0은 벽, 1이 다닐 수 있는 길 maps == 1 && 방문 안한곳
        dist = new int[maps.length][maps[0].length];
        dist[0][0] = 1;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0});
        bfs(q, maps, dist);
        
        return dist[maps.length - 1][maps[0].length - 1] != 0 ? 
                 dist[maps.length - 1][maps[0].length - 1] : -1;
    }
}