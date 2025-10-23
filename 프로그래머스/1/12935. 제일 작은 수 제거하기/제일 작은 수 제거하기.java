import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> wonbon = new ArrayList<>();
        
        for(int i : arr){
            wonbon.add(i);
        }
        
        if(wonbon.size() == 1){
            return new int[]{-1};
        }
        int min = Collections.min(wonbon);
        wonbon.remove(wonbon.indexOf(min));
        
        
        return wonbon.stream().mapToInt(Integer::intValue).toArray();
    }
}