import java.util.*;

public class Main{
    static int[] addX = new int[]{-1,0,1,0};
    static int[] addY = new int[]{0,1,0,-1};
    static int N;
    static List<Integer> resultList;
    
    static char[][] charArr;
    static boolean[][] visit;
    static Queue<Node> q;
    
    static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void bfs(Node node){
        int count = 1;
        visit[node.x][node.y] = true; 
        q.add(new Node(node.x, node.y));
        
        while(!q.isEmpty()){
            Node pollNode = q.poll();
            int curX = pollNode.x;
            int curY = pollNode.y;
            
            for(int i = 0; i < 4; i++){
            int nextX = curX + addX[i];
            int nextY = curY + addY[i];
            if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N){
                if(charArr[nextX][nextY] == '1' && visit[nextX][nextY] == false){
                    q.add(new Node(nextX, nextY));
                    count++;
                    visit[nextX][nextY] = true;
                  
                }
            }
        }
        }
        resultList.add(count);
        
        
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        resultList = new ArrayList<>(); 
        
        charArr = new char[N][N];
        visit = new boolean[N][N];
        
        for(int i = 0; i < N; i++){
            charArr[i] = sc.nextLine().toCharArray();            
        }
        q = new ArrayDeque<>();
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visit[i][j] && charArr[i][j] == '1'){
                    
                    bfs(new Node(i,j));
                    
                    
                }
            }
        }
        System.out.println(resultList.size());
        Collections.sort(resultList);
        for(int k : resultList){
            System.out.println(k);
        }
        
        
    }
}