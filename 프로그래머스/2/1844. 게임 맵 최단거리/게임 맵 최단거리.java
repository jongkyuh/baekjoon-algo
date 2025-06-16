import java.util.*;

class Solution {
    static int min = 100000000;    
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
        int[][] distance= new int[maps.length][maps[0].length];
        
        int[] addX = new int[]{-1, 0, 1, 0};
        int[] addY = new int[]{0, 1, 0, -1 };
        
        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(0,0));
        distance[0][0] = 1;
        while(!q.isEmpty()){
            Node getNode = q.poll();
            int curX = getNode.x;
            int curY = getNode.y;
            
            for(int i = 0; i < 4; i++){
                if(curX + addX[i] >= 0 && 
                   curX + addX[i] <= maps.length - 1 &&
                   curY + addY[i] >= 0 &&
                   curY + addY[i] <= maps[0].length - 1){
                    if(distance[curX + addX[i]][curY + addY[i]] == 0 && maps[curX + addX[i]][curY + addY[i]] == 1){
                        q.add(new Node(curX + addX[i], curY + addY[i]));
                        distance[curX + addX[i]][curY + addY[i]] = distance[curX][curY] + 1;
                    }
                }
            }
        }
        
        if(distance[maps.length - 1][maps[0].length - 1] == 0){
            answer =  -1;
        }else{
            answer =  distance[maps.length - 1][maps[0].length - 1];
        }
        return answer;
    }
}