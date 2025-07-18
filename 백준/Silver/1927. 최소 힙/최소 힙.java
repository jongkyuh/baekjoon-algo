import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < N; i++){
            int k = sc.nextInt();
            if(k == 0){
                if(pq.size() == 0) System.out.println(0);
                else System.out.println(pq.poll());
            }else{
                pq.add(k);
            }
        }
    }
}