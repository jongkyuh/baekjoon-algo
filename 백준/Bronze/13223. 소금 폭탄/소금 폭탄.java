import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] time = sc.nextLine().split(":");
        int firstHour = Integer.parseInt(time[0]);
        int firstMinute = Integer.parseInt(time[1]);
        int firstSecond = Integer.parseInt(time[2]);

        String[] secondTime = sc.nextLine().split(":"); 
        int secondHour = Integer.parseInt(secondTime[0]);
        int secondMinute = Integer.parseInt(secondTime[1]);
        int secondSecond = Integer.parseInt(secondTime[2]);

        int h = secondHour - firstHour;
        int m = secondMinute - firstMinute;
        int s = secondSecond - firstSecond;

        if (s < 0) {
            s += 60;
            m--;
        }
        if (m < 0) {
            m += 60;
            h--;
        }
        // 두 번째 시간이 이전 시간보다 작을 때 24시간을 더해줌
        if (h < 0) {
            h += 24;
        }
        
        if(h==0 && s==0 && m==0){
            h=24;
            s=0;
            m=0;
        }

        System.out.println(String.format("%02d:%02d:%02d", h, m, s));
    }
}
