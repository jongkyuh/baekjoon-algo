import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int input = sc.nextInt();
            if(input == 0){
                if(pq.size() == 0){
                    System.out.println(0);
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(input);
            }
        }
    }
}