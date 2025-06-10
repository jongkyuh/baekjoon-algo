class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean canUpper = true;
        
        char[] arr = s.toCharArray();
        
        for(char c : arr){
            if(c == ' '){
                canUpper = true;
                sb.append(" ");
                continue;
            }
            if(canUpper){
                if(Character.isDigit(c)){
                    sb.append(c);
                    canUpper = false;
                }else{
                    sb.append(Character.toUpperCase(c));
                    canUpper = false;
                }
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}