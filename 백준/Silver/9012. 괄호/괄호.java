import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            char[] ch = s.toCharArray();
            boolean is = true;
            for(int j = 0; j < ch.length; j++){
                if(ch[j] == '('){
                    stack.push('(');
                }else{
                    if(stack.isEmpty()){    
                        is = false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
                              
                
                
            }
            
            if(is && stack.isEmpty()){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
        }
    }
}