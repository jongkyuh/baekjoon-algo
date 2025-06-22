import java.util.*;

class Solution {
    public int solution(String dartResult) {
        // '0' : 48, '9' : 57
        int answer = 0;
        List<Integer> getScore = new ArrayList<>(); // 얻은 점수 리스트
        char preChar = ' ';
        int curNum = 0;
        
        int idx = 0;
        
        while(idx < dartResult.length()){
            int num = 0;
            // 1. 수 입력 받기 
            if(idx + 1 < dartResult.length() && dartResult.charAt(idx) == '1' && dartResult.charAt(idx + 1)  == '0'){
                num = 10;
                idx += 2;
            }else{
                num = dartResult.charAt(idx) - '0';
                idx += 1;
            }
            
            // 2. 보너스
            char bonus = dartResult.charAt(idx);
            if(bonus == 'S'){
                num = (int)Math.pow(num, 1);
            }else if(bonus == 'D'){
                num = (int)Math.pow(num, 2);
            }else if(bonus == 'T'){
                num = (int)Math.pow(num, 3);
            }
            idx++;
            
            // 3. 옵션 확인
            if(idx < dartResult.length()){
                char option = dartResult.charAt(idx);
                if(option == '*'){
                    num *= 2;
                    if(!getScore.isEmpty()){                    
                    int prevIdx = getScore.size() - 1;
                    getScore.set(prevIdx, getScore.get(prevIdx) * 2);
                  }
                    idx++;
                }else if(option == '#'){
                    num *= -1;
                    idx++;
                }

            }
            getScore.add(num);
        }
        
        for(int k : getScore){
            answer += k;
        }
        
        
        
        
        
        return answer;
    }
}