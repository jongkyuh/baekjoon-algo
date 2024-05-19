import java.util.*;

public class Main{
    public static void main(String[] args){
        int count = 0;
        int[] arr = new int[1000];
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = str.split(" ");
        int a = Integer.parseInt(str2[0]);
        int b = Integer.parseInt(str2[1]);
        
        int hap = 0;
        for(int i = 1;i<1000;i++){
            for(int j = 0;j<i;j++){
                if(count==1000){
                    break;
                }else{
                    arr[count] = i;
                    count++;
                }
            }
            if(count>1000){
                break;
            }
        }
        
        for(int i = a-1;i<b;i++){
            hap += arr[i];
        }
        
        System.out.println(hap);
        
    }
}