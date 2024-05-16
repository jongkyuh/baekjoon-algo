import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = str.split(" ");
        int n = Integer.parseInt(str2[0]);
        int k = Integer.parseInt(str2[1]);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for(int i = 1; i<=n;i++){
            arrayDeque.addLast(i);
        }
        
        while(arrayDeque.size()>1){
            for(int i = 0;i<k-1;i++){
                arrayDeque.addLast(arrayDeque.pollFirst());
            }
            sb.append(Integer.toString(arrayDeque.pollFirst()));
            sb.append(", ");
            
        }
        sb.append(Integer.toString(arrayDeque.pollFirst()));
        sb.append(">");
        
        System.out.println(sb.toString());
        
        
    }
}