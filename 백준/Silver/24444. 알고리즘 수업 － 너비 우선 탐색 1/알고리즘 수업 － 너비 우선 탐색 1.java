import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edge = sc.nextInt();
        int start = sc.nextInt();
        
        int[] result = new int[n+1];
        boolean[] visit = new boolean[n+1];
        List<Integer>[] edges = new ArrayList[n+1];
        int seq = 1;
        for(int i = 0; i < edges.length; i++){
            edges[i] = new ArrayList<>();
        }
        for(int i = 0; i < edge; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a].add(b);
            edges[b].add(a);
        }
        for(int i = 0; i < edges.length; i++){
            Collections.sort(edges[i]);
        }
        Queue<Integer> q = new ArrayDeque<>();
        
        q.add(start);
        visit[start] = true;
        result[start] = seq++;
        
        while(!q.isEmpty()){
            int poll = q.poll();
            for(int k : edges[poll]){
                if(!visit[k]){
                    result[k] = seq++;
                    visit[k] = true;
                    q.add(k);
                }
            }
        }
        for(int i = 1; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}