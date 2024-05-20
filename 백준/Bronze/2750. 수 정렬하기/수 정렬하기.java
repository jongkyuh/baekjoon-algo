import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<n;i++){
            arrList.add(Integer.parseInt(sc.nextLine()));
        }
        
        Collections.sort(arrList);
        
        for(int i = 0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }
    }
}