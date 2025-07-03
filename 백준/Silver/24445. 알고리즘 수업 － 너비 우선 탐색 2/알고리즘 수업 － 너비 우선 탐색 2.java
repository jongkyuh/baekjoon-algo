import java.util.*;

public class Main{
    
    static int[] result;
    static boolean[] visit;
    static List<Integer>[] edges;
    static Queue<Integer> q;
    static int seq = 1;
    static void bfs(){
       while(!q.isEmpty()){
           int poll = q.poll();
           for(int k : edges[poll]){
               if(!visit[k]){
                   q.add(k);
                   visit[k] = true;
                   result[k] = seq++;
               }
           }
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        int start = sc.nextInt();
        
        result = new int[N+1];
        visit = new boolean[N+1];
        edges = new ArrayList[N+1];
        for(int i = 0; i < N+1; i++){
            edges[i] = new ArrayList<>();
        }
        
        q = new ArrayDeque<>();
        
        for(int i = 0; i < E; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a].add(b);
            edges[b].add(a);
        }
        
        for(int i = 0; i < edges.length; i++){
            Collections.sort(edges[i], Collections.reverseOrder());
        }
        
        q.add(start);
        visit[start] = true;
        result[start] = seq++;
        
        bfs();
        for(int i = 1; i < result.length; i++){
            System.out.println(result[i]);
        }
        
    }
}