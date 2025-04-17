import java.util.*;

public class Main{ 
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        int min = 0;
        
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        int K = Integer.parseInt(str1[2]); 
        for(int i = 0; i < N;i++){
            String[] str2 = sc.nextLine().split(" ");
            map.put(str2[0], Integer.parseInt(str2[1]));
        }
        
        for(int i = 0; i < K;i++){
            String s = sc.nextLine();
            min += map.get(s);
            max += map.get(s);
            map.remove(s);
        }
        
        int count = M - K;
        List<Integer> list = new ArrayList<>(map.values());
        
        Collections.sort(list);    // 오름차순 정렬
        
        
        for(int i = 0; i < count;i++){    // min값
            min += list.get(i);
            max += list.get(list.size() - i - 1);
        }
        
        System.out.println(min + " " + max);
        
        
        
        
        
        
    }
}