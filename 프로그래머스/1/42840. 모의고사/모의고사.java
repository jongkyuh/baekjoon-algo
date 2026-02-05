import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] choice = {
            {1,2,3,4,5},
            { 2, 1, 2, 3, 2, 4, 2, 5},
            { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] result = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < choice.length; j++){
                if(answers[i] == choice[j][i%choice[j].length]){
                    result[j]++;
                }
            }
        }
        int max = Arrays.stream(result).max().getAsInt();
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < result.length; i++){
            if(result[i] == max) resultList.add(i+1);
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}