import java.util.*;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        
        boolean[] visit = new boolean[N+1];
        
        List<Integer>[] edges = new ArrayList[N+1];
        for(int i = 0; i < edges.length; i++){
            edges[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < E; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a].add(b);
            edges[b].add(a);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        q.add(1);
        visit[1] = true;
        
        while(!q.isEmpty()){
            int pollNum = q.poll();
            for(int k : edges[pollNum]){
                if(!visit[k]){
                    q.add(k);
                    visit[k] = true;
                }
            }
        }
        
        int count = 0;
        for(boolean b : visit){
            if(b)count++;
        }
        System.out.println(count - 1);
        
    }
}