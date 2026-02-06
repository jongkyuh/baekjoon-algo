import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int total = 0;
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
            total += number[i];
        }
        
        for(int i = 0; i < discount.length - total + 1; i++){
            Map<String, Integer> disMap = new HashMap<>();
            for(int j = i; j < i + total; j++){
                disMap.put(discount[j], disMap.getOrDefault(discount[j], 0) + 1);
            }
            if(map.equals(disMap)) answer++;
        }
        
        return answer;
    }
}