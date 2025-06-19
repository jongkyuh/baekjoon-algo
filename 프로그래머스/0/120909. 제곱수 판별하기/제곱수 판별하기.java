class Solution {
    public int solution(int n) {
        int answer = 0;
        double m = Math.sqrt(n);
        return (int)m == m ? 1 : 2;
    }
}