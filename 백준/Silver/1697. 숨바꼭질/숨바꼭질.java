import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int target = Integer.parseInt(str[1]);
        
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visit = new boolean[100001];
        q.add(N);
        visit[N] = true;
        int answer = 0;
        while(!q.isEmpty()){
            int size = q.size();           
            for(int i = 0; i < size; i++){
                int pollNum = q.poll();
                if(pollNum == target){
                    System.out.println(answer);
                    return;
                }
                int[] add = new int[]{pollNum - 1, pollNum + 1, pollNum * 2};
                for(int n :add){
                    if(n >= 0 && n < visit.length && !visit[n]){
                        visit[n] = true;
                        q.add(n);
                    }
                }
            }
            answer++;
        }
        
    }
}