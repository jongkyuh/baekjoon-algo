import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        Map<String, String> referralMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();
        
        for(int i = 0; i < enroll.length; i++){
            referralMap.put(enroll[i], referral[i]);
            resultMap.put(enroll[i], 0);
        }
        
        for(int i = 0; i < seller.length; i++){
            String now = seller[i];
            int total = amount[i] * 100;
            int na = 0;
            while(!now.equals("-")){
                if(total < 10){
                    resultMap.put(now, resultMap.get(now) + total);
                    break;
                }
                na = total / 10;
                resultMap.put(now, resultMap.get(now) + (total - na));
                total = na;
                now = referralMap.get(now);
            }
        }
        for(int i = 0; i < enroll.length; i++){
            answer[i] = resultMap.get(enroll[i]);
        }
        return answer;
    }
}