import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int E =sc.nextInt();
        int start = sc.nextInt();
        
        List<Integer>[] edges = new ArrayList[N+1];
        for(int i = 0; i < N+1; i++){
            edges[i] = new ArrayList<>();
        }
        for(int i = 0; i < E; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a].add(b);
            edges[b].add(a);
        }
        for(int i = 0; i < edges.length; i++){  
            Collections.sort(edges[i]);    // 오름차순 정렬
        }
        
        int[] result = new int[N+1];
        boolean[] visit = new boolean[N+1];
        Stack<Integer> stack = new Stack<>();
        int seq = 1;
        stack.push(start);
        while(!stack.isEmpty()){
            int pop = stack.pop();
            if(visit[pop])continue;
            visit[pop] = true;
            result[pop] = seq++;
            for(int number : edges[pop]){
                if(!visit[number]){
                    stack.push(number);
                }
            }
        }
        for(int i = 1; i < result.length; i++){
            System.out.println(result[i]);
        }
        
    }
}