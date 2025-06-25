import java.util.*;

class Solution {    
    static int[][] change(int n, int[] arr, int[][] changeArr){
        for(int i = 0; i < arr.length; i++){
            String s = Integer.toBinaryString(arr[i]);
            String format = String.format("%" + n + "s",s).replaceAll(" ","0");
            for(int j = 0; j < format.length(); j++){
                changeArr[i][j] = format.charAt(j) -'0';                
            }
        }
        return changeArr;
        
        
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        int[][] changeArr1 = new int[n][n];
        int[][] changeArr2 = new int[n][n];
        
        changeArr1 = change(n, arr1, changeArr1);
        changeArr2 = change(n, arr2, changeArr2);
        String[] result = new String[n];
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                if(changeArr1[i][j] == 0 &&changeArr2[i][j] == 0){
                    sb.append(" ");
                }else{
                    sb.append("#");
                }
            }
            result[i] = sb.toString();
        }
        
        return result;
    }
}