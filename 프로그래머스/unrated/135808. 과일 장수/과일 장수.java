import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
       Arrays.sort(score);
       int top=0;
        int length = score.length;
        for (int i = length -1; i > 0; i--) {
            if(k==score[i]){
                top=i;
                break;
            }

        }
        int answer=0;
        int i1 = length / m;
        for (int i = i1; i > 0; i--) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                min=Math.min(min,score[top]);
                top--;
            }
            answer+=min*m;
        }
        return answer;
    }
}