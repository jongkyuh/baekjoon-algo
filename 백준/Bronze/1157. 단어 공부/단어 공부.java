import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();

        int[] n = new int[26];

        
        
        for(int i = 0; i < str.length(); i++){
            n[str.charAt(i) - 'A']++;
            
        }

        int maxCount = -1;
        char result = '?';
        for(int i = 0; i < 26;i++){
           
             if(n[i] > maxCount){
                result = (char)(i + 'A');
                maxCount = n[i];
            }else if(maxCount == n[i])
                result = '?';
                
            
        }

        
            System.out.println(result);
        

    
    }

}