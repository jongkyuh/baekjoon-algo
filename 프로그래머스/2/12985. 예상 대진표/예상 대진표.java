class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");
        // 1 2 3 4 5 6 7 8 
        //  1   2   3   4
        //     1      2
        while(a != b){            
            answer++;
            a = (a+1) / 2;
            b = (b+1) / 2;

            
        }

        return answer;
    }
}