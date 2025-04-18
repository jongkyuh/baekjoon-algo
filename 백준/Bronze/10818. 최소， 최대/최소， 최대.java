import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] str = sc.nextLine().split(" ");
        List<Integer> list = Arrays.stream(str)
            .map(s ->Integer.parseInt(s))
            .collect(Collectors.toList());
        
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(min + " " + max);
    }
}