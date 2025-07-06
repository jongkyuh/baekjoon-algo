import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();    // 주어진 문자
        int testcase = Integer.parseInt(sc.nextLine());    // 테스트케이스 수
        for(int i = 0; i < testcase; i++){
            String[] strArr = sc.nextLine().split(" ");
            char target = strArr[0].charAt(0);    // 목표 알파벳
            int start = Integer.parseInt(strArr[1]);
            int end = Integer.parseInt(strArr[2]);
            int sum = 0;
            for(int j = start; j <= end; j++){
                if(target == s.charAt(j)){
                    sum++;
                }
            }
            System.out.println(sum);
        }
        
    }
}