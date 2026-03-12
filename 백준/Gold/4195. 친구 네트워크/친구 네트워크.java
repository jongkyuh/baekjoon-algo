import java.util.*;

public class Main{
    static int[] parent;
    static int[] size;
    static int find(int x){
        if(x == parent[x]) return parent[x];
        return parent[x] = find(parent[x]);
    }
    
    static int union(int x, int y){
        int a = find(x);
        int b = find(y);
        if(a != b){
            parent[b] = a;
            size[a] += size[b];
            return size[a];
        }
        return size[a];
    }
     
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        
        for(int i = 0; i < testcase; i++){
            int M = sc.nextInt();
            size = new int[2 * M];
            parent = new int[2 * M];
            int id = 0;
            for(int j = 0; j < 2 * M; j++){
                size[j] = 1;
                parent[j] = j;
            }
            Map<String, Integer> map = new HashMap<>();
            for(int j = 0; j < M; j++){
                String s1 = sc.next();
                String s2 = sc.next();
                if(!map.containsKey(s1)) map.put(s1, id++);
                if(!map.containsKey(s2)) map.put(s2, id++);
                int result = union(map.get(s1), map.get(s2));
                System.out.println(result);
            }
        }
    }
}