import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] intArr = new int[3];
        intArr[0] = Integer.parseInt(str[0]);
        intArr[1] = Integer.parseInt(str[1]);
        intArr[2] = Integer.parseInt(str[2]);
        
        Arrays.sort(intArr);
        
        System.out.println(intArr[1]);
        
        
    }
}