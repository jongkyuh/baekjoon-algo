import java.util.*;

public class Main{
    static Stack<Integer> stack;
    static boolean[] visit;
    static int[] result;
    static int seq = 1;
    static List<Integer>[] edges;
    static void dfs(int n){
        if(!visit[n]){
            visit[n] = true;
            result[n] = seq++;
            for(int child : edges[n]){
                if(!visit[child]){
                     dfs(child); 
                }

            }
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int E =sc.nextInt();
        int start = sc.nextInt();
        
        edges = new ArrayList[N+1];
        for(int i = 0; i < N+1; i++){
            edges[i] = new ArrayList<>();
        }
        for(int i = 0; i < E; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a].add(b);
            edges[b].add(a);
        }
        for(int i = 0; i < edges.length; i++){  
            Collections.sort(edges[i],Collections.reverseOrder());   
        }
        
        result = new int[N+1];
        visit = new boolean[N+1];
       
        stack = new Stack<>();
        dfs(start);
        for(int i = 1; i < result.length; i++){
            System.out.println(result[i]);
        }
        
    }
}