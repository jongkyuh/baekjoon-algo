import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayDeque<Integer> arrDe = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            arrDe.addFirst(i+1);           
        }
        
        while(arrDe.size()>1){
            arrDe.pollLast();
            arrDe.addFirst(arrDe.pollLast());
        }
        
        System.out.println(arrDe.pollLast());
    }
}