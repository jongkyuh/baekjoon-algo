import java.util.*;

public class Main{
    public static void main(String[] args){
        double result = 0;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
            
        String s = sc.nextLine();
        
        String[] str = s.split(" ");   
        int len = str.length;
        double[] arr = new double[len];
          
        for(int i = 0;i<len;i++){
            arr[i] = (double)Integer.parseInt(str[i]);
        }
        
           double m = arr[0];
        
        for(int i = 1;i<len;i++){
            if(m<arr[i]) m = arr[i];
        }
        
        for(int i = 0;i<len;i++){
            result += ((double)arr[i]/m)*100;
        }
        
        System.out.println((double)result / (double)len);
        
        
        
    }
}