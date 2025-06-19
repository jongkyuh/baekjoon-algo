class Solution {
    public String solution(int[] food) {
        // String answer = "";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 == 0){   // 짝수 
               for(int j = 0; j < food[i] / 2; j++){
                   sb1.append((i)+"");
                   sb2.insert(0, (i)+"");
               } 
            }else{
                if(food[i] > 2){
                    for(int k = 0; k < (food[i] - 1) / 2; k++){
                        sb1.append((i)+"");
                        sb2.insert(0, (i)+"");
                    }
                  
                }
            }
        }
        sb1.append("0");
        sb1.append(sb2.toString());
        return sb1.toString();
    }
}