import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int count = B.length;
        for(int i = 0; i < A.length; i++){
            answer += (A[i] * B[count - i -1]);
        }
       
        return answer;
    }
}