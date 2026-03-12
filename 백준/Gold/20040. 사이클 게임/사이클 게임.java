import java.util.*;

public class Main{
    static int[] parent;
    static int find(int x){
        if(x == parent[x]) return parent[x];
        return parent[x] = find(parent[x]);
    }
    static void union(int x, int y){
        int a = find(x);
        int b = find(y);
        if(a != b){
            parent[b] = parent[a];
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        parent = new int[N];
        for(int i = 0; i < N; i++){
            parent[i] = i;
        }
        
        for(int i = 0; i < M; i++){
            int from = sc.nextInt();
            int to = sc.nextInt();
            if(find(from) == find(to)){
                System.out.println(i+1);
                return;
            }
            union(from,to);
        }
        System.out.println(0);
    }
}