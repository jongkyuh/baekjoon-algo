import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int g = Integer.parseInt(sc.nextLine());

        HashSet<Integer> hash = new HashSet<>();
        int count = 0;
        for(int i = 0; i < n;i++){
            if(hash.contains(g-arr[i])){
                ++count;
            }
            hash.add(arr[i]);
        }

        System.out.println(count);
        
    }
}