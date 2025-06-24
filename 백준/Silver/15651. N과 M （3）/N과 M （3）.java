import java.util.*;

public class Main{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    
    static void dfs(int target, List<Integer> list){
        if(list.size() == target){
            for(int k : list){
                sb.append(k+" ");
            }
            
            sb.append("\n");          
            return;
        }
        
        for(int i = 1; i <= N; i++){            
            list.add(i);
            dfs(target, list);
            list.remove(list.size() -1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] str = sc.nextLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        
        dfs(M, new ArrayList<>());
        System.out.println(sb.toString().trim());
        
        
    }
}