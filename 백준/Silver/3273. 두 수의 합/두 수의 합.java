import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        int k = Integer.parseInt(sc.nextLine());
        int count = 0;
        
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(str[i]);

            if(hash.contains(k-num)){
                count++;
            }
            hash.add(num);
            
        }

      

        System.out.println(count);
    }
}