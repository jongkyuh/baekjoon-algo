import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map =new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(String[] arr : photo){
            int hap = 0;
            for(String s : arr){
                hap += map.getOrDefault(s, 0);
            }
            answer.add(hap);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}