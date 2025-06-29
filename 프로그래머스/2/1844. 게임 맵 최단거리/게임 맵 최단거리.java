import java.util.*;

class Solution {
    
    static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visit = new int[maps.length][maps[0].length];
        Queue<Node> q = new ArrayDeque<>();
        
        // x와y의 이동방향 배열             
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
        q.add(new Node(0,0));
        visit[0][0] = 1;

        while(!q.isEmpty()){
            Node cNode = q.poll();  // 꺼낸 노드
            int cx = cNode.x;
            int cy = cNode.y;
            
            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length){
                    if(maps[nx][ny] == 1 && visit[nx][ny] == 0){
                        q.add(new Node(nx, ny));
                        visit[nx][ny] = visit[cx][cy] + 1;
                    }
                }
            }
        }
        
        int result = visit[visit.length - 1][visit[0].length - 1];
        return result != 0 ? result : -1;
    }
}