import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : citations){
            list.add(i);
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            int h = list.size() - i;
            if(list.get(i) >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}