import java.util.*;

public class Main{
    
    static int[] arr;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        
        arr = new int[n+1];
        
        for(int i = 0; i < n + 1 ;i++){
            arr[i] = i;
        }
        
        for(int i =0; i < Integer.parseInt(str[1]); i++){
            String[] str2 = sc.nextLine().split(" ");
            
            if(str2[0].equals("0")){
                union(Integer.parseInt(str2[1]),Integer.parseInt(str2[2]));
            }else if(str2[0].equals("1")){                
                Boolean bl = isSame(Integer.parseInt(str2[1]),Integer.parseInt(str2[2]));
                if(bl == true){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        
        
    }
    
    static int find(int x){
        if(arr[x] == x){
            return x;
        }
        return arr[x] = find(arr[x]);
    }
    
    static void union(int x, int y){
        int root1 = find(x);
        int root2 = find(y);
        arr[root2] = root1;
    }
    
    static boolean isSame(int x, int y){
       return find(x) == find(y);
    }
    
}