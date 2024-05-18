import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] str2 = str.split(" ");
        
        int count = 0;
        
        for(int i = 0;i<n;i++){
            int number = Integer.parseInt(str2[i]);   
            boolean check = true;
            
            if(number == 1){
                check = false;
            }
            for(int j = 2;j<=Math.sqrt(number);j++){
                if(number % j == 0){
                    check = false;
                }
            }
                
                          
            if(check == true){
                count++;
            }
        }
        
        System.out.println(count);
        
        
    }
}