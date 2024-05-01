import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = Integer.parseInt(sc.nextLine());        
        int n = Integer.parseInt(sc.nextLine());
        int realResult = 0;
        for(int i = 0;i<n;i++){
            String[] str = sc.nextLine().split(" ");
            realResult += Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
        }
        
        if(result == realResult){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}