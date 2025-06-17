import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1}; 
        boolean[][][] isVisit = new boolean[11][11][4];
        int x = 5;
        int y = 5;
        int d = 0;
        for(char c : dirs.toCharArray()){
	if(c == 'U') d = 0;
            if(c == 'R') d = 1;
            if(c == 'D') d = 2;
            if(c == 'L') d = 3;

            int nx = x + dx[d];
            int ny = y + dy[d];

	if(nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;
            if(!isVisit[x][y][d]){
	  isVisit[x][y][d] = true;
              isVisit[nx][ny][(d+2)%4] = true;
	  answer++;
    } 
        x = nx;
        y  = ny;
    }
        return answer;
    }
}