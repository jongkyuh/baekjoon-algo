import java.util.*;

public class Main{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int[][] number= new int[t][10];
        for(int i = 0;i<t;i++){
            String str = sc.nextLine();
            String[] str2 = str.split(" ");
            for(int j = 0;j<10;j++){
                number[i][j] = Integer.parseInt(str2[j]);
            }
        }

        for(int i = 0;i<t;i++){
            Arrays.sort(number[i]);
            
            System.out.println(number[i][7]);
        }
    }
}