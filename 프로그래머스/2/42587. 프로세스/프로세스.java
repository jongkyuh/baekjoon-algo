import java.util.*;

class Solution {
    static class Person{
        int idx;
        int p;
        public Person(int idx, int p){
            this.idx = idx;
            this.p = p;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Person> q = new ArrayDeque<>();
        for(int i = 0; i < priorities.length; i++){
            q.add(new Person(i, priorities[i]));
        }
        
        while(true){
            int max = 0;
            for(Person getP : q){
                max = Math.max(getP.p,max);
            }
            
            Person getPerson = q.poll();
            
            if(max == getPerson.p){
                answer++;
                if(getPerson.idx == location){
                    break;
                }
            }else{
                q.add(getPerson);
            }
            
        }
        return answer;
    }
}