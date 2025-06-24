import java.util.*;

public class Main{
    
    static int N;
    static int M;
    public static void dfs(int count, int target, List<Integer> list){
        if(count == target){
            StringBuilder sb = new StringBuilder();
            for(int k : list){
                sb.append(k + " ");                
            }
            System.out.println(sb.toString().trim());
            return;
        }
        for(int i = 1; i <= N; i++){
            if(!list.contains(i)){
                List<Integer> newList = new ArrayList<>(list);
                newList.add(i);
                dfs(count + 1, target, newList);
            }
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        
        List<Integer> firstList = new ArrayList<>();
        dfs(0, M, firstList);
        
    }
}