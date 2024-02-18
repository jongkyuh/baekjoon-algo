import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        // 처음 입력
        int total = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[total];

        //두번째 입력
        String st = sc.nextLine();

        String[] sp = st.split(" ");


        for(int i = 0;i<total;i++){
            arr[i] = Integer.parseInt(sp[i]);
        }

        int checkNum = sc.nextInt();

        for(int i = 0;i<total;i++){
            if(checkNum == arr[i]){
                result++;
            }
        }

        System.out.println(result);
    }
}
