import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
       int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int mem=n;
        int card=k;
        for (int i = 0; i < enemy.length; i++) {
            mem-=enemy[i];
            pq.add(enemy[i]);
            if(mem<0){
                if(card>0&&!pq.isEmpty()){
                    Integer poll = pq.poll();
                    mem+=poll;
                    card--;
                }
                else {
                    answer=i;
                    break;
                }
               
            }
        }
        return answer;
    }
}