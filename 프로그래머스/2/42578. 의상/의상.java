import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] cloth : clothes){
            String s = cloth[1];
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        
        for(int i : list){
            answer *= (i+1);
        }
        return answer - 1;
    }
}