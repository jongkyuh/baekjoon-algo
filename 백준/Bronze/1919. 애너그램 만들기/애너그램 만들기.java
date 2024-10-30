import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = getCount(a);
        int[] countB = getCount(b);
       

        int ans = 0;
        for(int i = 0; i < 26;i++){
            ans += Math.abs(countA[i]-countB[i]);            
        }
       System.out.println(ans);
    } 

    public static int[] getCount(String str){
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++){
        count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    
}