import java.util.*;

public class Main{
    static int[][] maps;
    static int sum = 0;
    static int[] addX = new int[]{-1, 0, 1, 0};
    static int[] addY = new int[]{0, 1, 0, -1};
    static void dfs(int x, int y, boolean[][] visit){
        for(int i = 0; i < 4; i++){
            int nextX = x + addX[i];
            int nextY = y + addY[i];
            if(nextX >= 0 && nextX < visit.length && nextY >= 0 && nextY < visit[0].length){
                if(!visit[nextX][nextY] && maps[nextX][nextY] == 1){
                    visit[nextX][nextY] = true;
                    dfs(nextX, nextY, visit);
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < testcase; i++){
            int answer = 0;            
            String[] info = sc.nextLine().split(" ");
            int y = Integer.parseInt(info[0]);
            int x = Integer.parseInt(info[1]);
            
            maps = new int[x][y];    // 배추밭
            boolean[][] visit = new boolean[x][y];    // 방문여부 
            
            int num = Integer.parseInt(info[2]);    // 지렁이가 있는곳 정보 
            for(int j = 0; j < num; j++){           // 지렁이가 있는곳 정보
                info = sc.nextLine().split(" ");
                y = Integer.parseInt(info[0]);
                x = Integer.parseInt(info[1]);
                maps[x][y] = 1;    
            }
            for(int x1 = 0; x1 < visit.length; x1++){
                for(int y1 = 0; y1 < visit[0].length; y1++){
                    if(!visit[x1][y1] && maps[x1][y1] == 1){    // 미방문시
                        sum++;
                        visit[x1][y1] = true;
                        dfs(x1, y1, visit);
                    }
                }
            }
            
            System.out.println(sum);
            sum = 0; 
            
            
        }
        
        
    }
}