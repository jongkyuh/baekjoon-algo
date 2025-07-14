import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[s.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.charAt(i) - '0';
        }
        
        arr = Arrays.stream(arr)
                    .boxed()
                    .sorted((e1,e2) -> e2.compareTo(e1))
                    .mapToInt(Integer::intValue)
                    .toArray();
        StringBuilder sb = new StringBuilder();
        
        for(int k : arr){
            sb.append(k);
        }
        
        System.out.println(sb.toString());
    }
} 