import java.util.*;

public class Main{
    static int[] parent;
    static int find(int x){
        if(parent[x] != x){
            return parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    static void union(int x, int y){
        if(find(x) != find(y)){
            int a = find(x);
            int b = find(y);
            parent[b] = a;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); // M만큼 반복
        parent = new int[N+1];
        // 1. 부모배열 초기화(처음엔 자기자신으로)
        for(int i = 0; i <= N; i++){
            parent[i] = i;
        }
        for(int i = 0; i < M; i++){
            int check = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(check == 0){
                union(a,b);
            }else{
                if(find(a) == find(b)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        
    }
}