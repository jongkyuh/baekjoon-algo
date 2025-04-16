import java.util.*;

public class Main{
    
    static class NumInfo{
        int num;
        int freq;
        int idx;
        public NumInfo(int num, int freq, int idx){
            this.num = num;
            this.freq = freq;
            this.idx = idx;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int c = Integer.parseInt(str1[1]);
        Map<Integer, NumInfo> map = new HashMap<>();
        String[] str2 = sc.nextLine().split(" ");
        int idx = 0;
        
        for(int i = 0; i < n;i++){
            int num = Integer.parseInt(str2[i]);
            if(!map.containsKey(num)){
                map.put(num, new NumInfo(num, 1, idx++));
            }else{
                map.get(num).freq++;
            }
        }
        
        List<NumInfo> list = new ArrayList<>(map.values());
        
        list.sort((l1, l2) -> {
            if(l1.freq != l2.freq){
                return l2.freq - l1.freq;
            }
            return l1.idx - l2.idx;        
        });
        
        for(NumInfo info : list){
            for(int i = 0; i < info.freq; i++){
                System.out.print(info.num + " ");
            }
        }
        
    }
}