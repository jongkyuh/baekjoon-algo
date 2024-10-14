import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int check = sc.nextInt();
        int[] arr = new int[check+1]; // 배열 크기를 check+1로 설정하여 충분한 공간 확보
        
        // 피보나치 수열의 첫 두 값 설정
        arr[0] = 0;
        arr[1] = 1;
        
        if (check == 0) {
            System.out.println(0);  // 0번째 피보나치 수는 0
        } else if (check == 1) {
            System.out.println(1);  // 1번째 피보나치 수는 1
        } else {
            // 피보나치 수열 계산
            for (int i = 2; i <= check; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
            // check번째 피보나치 수 출력
            System.out.println(arr[check]);
        }
    }
}
