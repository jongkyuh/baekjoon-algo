import java.util.*;
import java.io.*;

public class Main{
    static int[] visit;
    static int[][] graph;
    static int N;
    static int M;
    // static int start;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        
        
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        int start = Integer.parseInt(str[2]);
        
        visit = new int[N + 1];    // 방문여부 초기화 
        graph = new int[N+1][N+1]; // 그래프 초기화
        
        for(int i = 0; i < M; i++){    // 연결되어 있는 간선 연결 
            String[] vertex = br.readLine().split(" ");
            int a = Integer.parseInt(vertex[0]);
            int b = Integer.parseInt(vertex[1]);
            
            graph[a][b] = graph[b][a] = 1;
        }
        
        DFS(start);
        
        Arrays.fill(visit,0);
        bw.newLine();
        
        BFS(start);
        bw.close();
        br.close();
        
        
        
        
    }
    
    static void DFS(int start) throws IOException{
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        stack.push(start);
        
        while(!stack.isEmpty()){
            int a = stack.pop();
            if(visit[a] == 0){
                visit[a] = 1;
               // bw.write(a + " ");
                sb.append(a + " ");
                ArrayList<Integer> arrList = new ArrayList<>();
                
                for(int i = 1; i < N + 1;i++){
                    if(visit[i] == 0 && graph[a][i] == 1){
                        arrList.add(i);
                    }
                }
                Collections.sort(arrList,Collections.reverseOrder());    // 내림차순 정렬
                
                for(int b : arrList){
                    stack.push(b);
                }
                arrList.clear(); 
            }           
            
        }
        
        bw.write(sb.toString()); 
        bw.flush();
        
    }
    
    static void BFS(int start) throws IOException{
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        queue.add(start);
        visit[start] = 1;
       // bw.write(start + " ");
        sb.append(start + " ");
        
        while(!queue.isEmpty()){
            int a = queue.poll();
            for(int i = 1; i < N + 1;i++){
                if(visit[i] == 0 && graph[a][i] == 1){
                    queue.add(i);
                    visit[i] = 1;
                  //  bw.write(i + " ");
                    sb.append(i + " ");
                }
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        
    }
}