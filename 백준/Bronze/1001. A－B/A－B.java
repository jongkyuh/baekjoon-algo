import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] splitStr = st.split(" ");
        int num1 = Integer.parseInt(splitStr[0]);
        int num2 = Integer.parseInt(splitStr[1]);
        
        System.out.println(num1-num2);
    }
}