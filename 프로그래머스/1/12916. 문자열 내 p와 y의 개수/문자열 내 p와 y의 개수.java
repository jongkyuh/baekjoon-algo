import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String s1 = s;
        String s2 = s;
        
        s1 = s.replaceAll("[^yY]","");
        s2 = s.replaceAll("[^pP]","");
        
        return s1.length() == s2.length() ? true : false;
    }
}