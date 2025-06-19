class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){   // 공백일 댸 
                sb.append(" ");
                continue;
            }
            int imsi;
            if((int)c >= 97){   //대문자일 때 
             imsi = (int)c + n;
                if(imsi > 122) imsi -= 26;
            }else{
             imsi = (int)c + n;
                if(imsi > 90) imsi -= 26;
            }
            
            
           sb.append((char)imsi);
            
        }
        return sb.toString();
    }
}