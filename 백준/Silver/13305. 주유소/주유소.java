import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        int[] distance = new int[n-1];
        int[] oil = new int[n];
          
        for(int i = 0; i < distance.length; i++){
            distance[i] = Integer.parseInt(str[i]);
        }
        
        str = sc.nextLine().split(" ");
        
        for(int i = 0; i < oil.length; i++){
            oil[i] = Integer.parseInt(str[i]);
        }
        
        int min = oil[0];
        int sum = 0;
        for(int i = 0; i < n-1 ;i++){
            if(oil[i] < min){
                min = oil[i];
            }
            sum += min * distance[i];
        }
        System.out.print(sum);
           
    }
}