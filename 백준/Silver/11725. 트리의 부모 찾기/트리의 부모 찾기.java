import java.util.*;

public class Main{  
    
    static boolean[] visit;
    static List<Integer>[] arrList;
    static int[] result;
    
    static void dfs(int num){
        if(visit[num]) return;
        visit[num] = true;
        for(int n : arrList[num]){
            if(!visit[n]){                
                result[n] = num;
                dfs(n);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
       
        
        arrList = new ArrayList[N+1];
        for(int i = 0; i < arrList.length; i++){
            arrList[i] = new ArrayList<>();
        }
        for(int i = 0; i < N-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();    
            arrList[a].add(b);
            arrList[b].add(a);
        }
        
        visit = new boolean[N+1];
        result = new int[N+1];
        dfs(1);
        for(int i = 2; i < N+1; i++){
            System.out.println(result[i]);
        }
        
    }
}