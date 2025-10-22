import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String s : skill_trees){
            s = s.replaceAll("[^" + skill + "]", "");
            if(skill.startsWith(s)) answer++;
        }
        return answer;
    }
}