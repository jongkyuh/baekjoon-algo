import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < topping.length; i++){
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i = 0; i < topping.length; i++){
            int getN = topping[i];
            set.add(getN);
            map.put(getN, map.getOrDefault(getN, 0) - 1);
            if(map.get(getN) == 0) map.remove(getN);
            if(set.size() == map.size()) answer++;
        }
        return answer;
    }
}