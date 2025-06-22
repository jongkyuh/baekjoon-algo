import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int countZero = 0;
        int currentGrade = 7;
        List<Integer> winList = new ArrayList<>();
        for(int n : win_nums){
            winList.add(n);
        }
        
        for(int k : lottos){
            if(k == 0){
                countZero++;
                continue;
            }
            
            if(winList.contains(k)){
                // 일치할 때 
                currentGrade--;
            }
        }
        
        
        return new int[]{currentGrade - countZero == 7 ? 6 : currentGrade - countZero, currentGrade == 7 ? 6 : currentGrade};
    }
}