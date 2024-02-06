import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] sp = st.split(" ");
        int num1 = Integer.parseInt(sp[0]);
        int num2 = Integer.parseInt(sp[1]);
        
        double result = (double)num1 / (double)num2;
        System.out.println(result);
    }
}