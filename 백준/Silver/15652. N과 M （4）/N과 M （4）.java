import java.util.*;

public class Main{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static void dfs(int count, List<Integer> list){
        if(count == M){
            for(int k : list){
                sb.append(k + " ");
            }
            sb.append("\n");
            return;
        }
        
        int start = list.size() == 0 ? count + 1 : list.get(list.size() - 1);
        for(int i = start; i <= N; i++){
            list.add(i);
            dfs(count + 1, list);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] str = sc.nextLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        
        dfs(0, new ArrayList<>());
        
        System.out.println(sb.toString().trim());
    }
}