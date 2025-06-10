class Solution {
    public int solution(int n) {
        int answer = 0;
        int binaryHap = 0;
        String binaryN = Integer.toBinaryString(n);
        for(char c : binaryN.toCharArray()){
            if(c == '1') binaryHap++;
        }
        n++;
        while(true){
            binaryN = Integer.toBinaryString(n);
            int getBinaryN = 0;
            for(char c : binaryN.toCharArray()){
                if(c == '1') getBinaryN++;
            }
            
            if(getBinaryN == binaryHap){
                answer = n;
                break;
            }
            n++;
        }
        
        return answer;
    }
}