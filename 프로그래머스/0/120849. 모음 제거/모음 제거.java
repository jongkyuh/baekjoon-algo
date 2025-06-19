class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) continue;
            if(c == ' '){
               sb.append(" "); 
            }else{
                sb.append(c);
            }
            
        }
        return sb.toString();
    }
}