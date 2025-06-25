class Solution {
    static boolean isCheck(int n){
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(isCheck(i)){
                answer++;
            }
        }
        return answer;
    }
}