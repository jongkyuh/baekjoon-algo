import java.util.*;

public class Main{
    
    static int[] parent;
    
    static int find(int x){
        if(parent[x] == x){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    
    static void union(int x, int y){
        int root1 = find(x);
        int root2 = find(y);
        parent[root2] = root1;      
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        
        parent = new int[n+1];
        for(int i = 0; i < n+1;i++){
            parent[i] = i;
        }
        
        for(int i = 0;i<m;i++){
            String[] str2 = sc.nextLine().split(" ");
            int edge1 = Integer.parseInt(str2[1]);
            int edge2 = Integer.parseInt(str2[2]);
            if(str2[0].equals("0")){
                union(edge1,edge2);
            }else{
                if(find(edge1) == find(edge2)){
                    System.out.println("YES");
                }else{
                   System.out.println("NO"); 
                }
            }
        }
        
    }
}