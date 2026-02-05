import java.util.*;

class Solution {
    static class Info{
        int stage;
        double failure;
        public Info(int stage, double failure){
            this.failure = failure;
            this.stage = stage;
        }
    }
    
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        List<Info> result = new ArrayList<>();
        
        int[] count = new int[N+2];
        
        int people = stages.length;
        for(int i = 0; i < stages.length; i++){
            count[stages[i]]++; 
        }
        
        for(int i = 1; i <= N; i++){
            double failure = 0;
            if(people != 0){
                failure = (double)count[i] / people;
                people -= count[i];
            }
            result.add(new Info(i, failure));
        }
        
        result.sort((a,b) -> {
           if(b.failure == a.failure) return  a.stage - b.stage;
            return Double.compare(b.failure, a.failure);
        });
        int[] resultArr = new int[N];
        for(int i = 0; i < resultArr.length; i++){
            resultArr[i] = result.get(i).stage;
        }
        return resultArr;
    }
}