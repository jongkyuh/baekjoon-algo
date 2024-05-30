import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet= new HashSet<>();
        String[] str = sc.nextLine().split(" ");
        for(int i = 0;i < Integer.parseInt(str[0]);i++){
            String s = sc.nextLine();
            hashSet.add(s);
        }
        ArrayList<String> arrList = new ArrayList<>();
        for(int i = 0;i<Integer.parseInt(str[1]);i++){
            String s = sc.nextLine();
            if(hashSet.contains(s)){
                arrList.add(s);
            }
        }
        
        System.out.println(arrList.size());
        
        Collections.sort(arrList);
        for(int i = 0; i < arrList.size();i++){
            System.out.println(arrList.get(i));
        }
        
    }
}