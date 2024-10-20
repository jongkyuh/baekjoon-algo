import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < n; i++){
            String[] str = sc.nextLine().split(" ");
            if(str.length > 1){    // push
                stack.push(Integer.parseInt(str[1]));
            }else{
                if(str[0].equals("pop")){    //pop
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        int a = stack.pop();
                        System.out.println(a);
                    }
                }else if(str[0].equals("size")){    //size
                    System.out.println(stack.size());
                }else if(str[0].equals("empty")){    //empty
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                }else{
                    if(stack.isEmpty()){        //top
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.peek());
                    }
                }
            }
        }
    }
}