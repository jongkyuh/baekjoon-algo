class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        String s = t.substring(0,pLen);
        for(int i = 0; i < t.length() - pLen + 1; i++){
            s = t.substring(i,i + pLen);
            if(s.compareTo(p) <= 0) answer++;
        }
        return answer;
    }
}