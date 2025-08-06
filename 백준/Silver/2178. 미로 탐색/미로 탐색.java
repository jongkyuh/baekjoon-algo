import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        int[][] map = new int[n][m];
        for(int i = 0; i < n; i++){
            String line = sc.nextLine();
            for(int j = 0; j < m; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }
        
        int[] addX = new int[]{0,1,0,-1};
        int[] addY = new int[]{-1,0,1,0};
        
        int[][] visit = new int[n][m];
        
        Deque<int[]> q = new ArrayDeque<>();
        
        q.addLast(new int[]{0,0});
        visit[0][0] = 1; // 거리 1
        
        while(!q.isEmpty()){
            int[] pollArr = q.pollFirst();
            int currentX = pollArr[0];
            int currentY = pollArr[1];
            
            for(int i = 0 ; i < 4;i++){
                int newX = currentX + addX[i];
                int newY = currentY + addY[i];
                
                if(newX >= 0 && newX < n && newY >= 0 && newY < m){
                    if(visit[newX][newY] == 0 && map[newX][newY] == 1){
                        visit[newX][newY] = visit[currentX][currentY] + 1;
                        q.add(new int[]{newX, newY});
                    }
                }
            }
        }
        
        System.out.println(visit[n-1][m-1]);
    }
}