class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 1 금요일
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int sum = 0;
        
        for(int i = 1; i < a; i++){
            if(i==1 || i == 3 || i == 5 || i == 7 || i== 8 || i== 10 || i == 12) sum += 31;
            if(i == 4 || i == 6 || i == 9 || i == 11) sum += 30;
            if(i == 2) sum += 29;
        }
        sum += b;
        
        int idx = (sum-1) % 7;
        return week[idx];
    }
}