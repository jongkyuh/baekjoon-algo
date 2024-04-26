import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input = sc.nextInt();        
        int goose = 0;
        int duck = input;
        
        while(true){
            if(goose>=0 && (goose+1 == duck)){
                System.out.println("Goose");
                break;
            }else{
                ++goose;
            }
            
            if(duck<=input-1 && (duck-1 == goose)){
                System.out.println("Duck");
                break;
            }else{
                --duck;
            }
        }
    }
}
