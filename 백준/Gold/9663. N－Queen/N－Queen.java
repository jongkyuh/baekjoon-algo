import java.util.*;

public class Main{
    static int N;
    static int[] maps;
    static int count = 0;
    static void dfs(int k){
        if(k == N){
            count++;
            return;                            
        }
        for(int i = 0; i < N; i++){
            maps[k] = i;
            boolean check = true;
            for(int j= 0; j < k; j++){
                if(maps[k] == maps[j] || Math.abs(maps[k] - maps[j]) == Math.abs(k - j)){
                    check = false;
                    break;
                }
            }
            
            if(check){
                dfs(k+1);
            }
                
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        maps = new int[N];
        
        dfs(0);
        
        System.out.println(count);
        
    }
}