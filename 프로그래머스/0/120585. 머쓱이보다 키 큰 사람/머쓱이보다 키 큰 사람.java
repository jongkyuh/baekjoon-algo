import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        array = Arrays.stream(array).boxed().sorted((c1,c2) -> c2 - c1).mapToInt(Integer::intValue).toArray();
        
        for(int n : array){
            if(n > height) answer++;
            else break;
        }
        return answer;
    }
}