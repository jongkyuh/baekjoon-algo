import java.util.*;

public class Main{
    
    static int[] visit;
    static int[][] graph;
    static int N;
    static int M;
    static int start;
    
    static void DFS(int start){
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while(!stack.isEmpty()){
            int a = stack.pop();
            if(visit[a] == 0){
            visit[a] = 1;
            System.out.print(a + " ");
            ArrayList<Integer> arrList = new ArrayList<>();
            for(int i = 1;i < N + 1;i++){
                
                if(visit[i] != 1 && graph[a][i] == 1){
                    arrList.add(i);
                }
                if(arrList.size() != 0){
                    Collections.sort(arrList,Collections.reverseOrder());
                    for(int j : arrList){
                        stack.push(j);
                    }
                }
                
                
            }
            
        }
      }
    }
    
    static void BFS(int start){
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        System.out.print(start + " ");
        visit[start] = 1;
        while(!queue.isEmpty()){
            int a = queue.poll();
            for(int i = 1; i < N + 1; i++){
                if(visit[i] != 1 && graph[a][i] == 1){
                    visit[i] = 1;
                    queue.add(i);
                    System.out.print(i + " ");
                }
            }
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        start = sc.nextInt();
        
        visit = new int[N+1];
        graph = new int[N+1][N+1];
        
        for(int i = 0; i < M; i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }
        
        DFS(start);
        
        Arrays.fill(visit, 0);
        
        System.out.print("\n");
        
        BFS(start);
        
        
    }
}