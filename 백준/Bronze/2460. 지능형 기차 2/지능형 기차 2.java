import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int peopleNum = 0;
        int[][] number = new int[10][2];
        for(int i = 0;i<10;i++){
            String str = sc.nextLine();
            String[] str2 = str.split(" ");
            for(int j = 0;j<2;j++){
                number[i][j] = Integer.parseInt(str2[j]);
            }            
        }
        
        for(int i = 0;i<10;i++){
            peopleNum = peopleNum - number[i][0] + number[i][1];
            arrList.add(peopleNum);
        }
        
        Collections.sort(arrList);
        
        System.out.println(arrList.get(9).toString());
        
        
        
    }
}