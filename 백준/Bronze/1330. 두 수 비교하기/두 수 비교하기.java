import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] token = str1.split(" ");
        int num1 = Integer.parseInt(token[0]);
        int num2 = Integer.parseInt(token[1]);
        
        if(num1>num2){
            System.out.print(">");
        }else if(num1<num2){
            System.out.print("<");
        }else{
            System.out.print("==");
        }
    }
}