import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<count;i++){
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[1]);
            System.out.println(num1 + num2);
        }
    }
}