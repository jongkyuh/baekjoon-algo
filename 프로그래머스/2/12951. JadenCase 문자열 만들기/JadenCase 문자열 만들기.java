class Solution {
    public String solution(String s) {
        String answer = "";
        boolean preGong = true;
        for(char c : s.toCharArray()){
            if(c == ' '){
                answer += " ";
                preGong = true;
                continue;
            }
            if(c != ' ' && preGong == true){
                preGong = false;
                answer += Character.toUpperCase(c) + "";
            }else{
                answer += Character.toLowerCase(c) + "";
            }
        }
        return answer;
    }
}