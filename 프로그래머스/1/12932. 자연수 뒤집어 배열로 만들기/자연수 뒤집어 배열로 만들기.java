import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String s = n + "";
        char[] charArr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            charArr[i] = s.charAt(s.length() - i - 1);
        }
        for(int i = 0; i < charArr.length; i++){
            answer.add(charArr[i] - '0');
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}