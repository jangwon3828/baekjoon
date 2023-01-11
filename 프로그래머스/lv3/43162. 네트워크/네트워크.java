import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer=0;

        boolean[] check=new boolean[n];
        for (int j = 0; j < n; j++) {
            if(check[j])continue;
            Queue<Integer>q=new LinkedList<>();
            q.offer(j);
            while(!q.isEmpty()){
                Integer poll = q.poll();
                for (int i = 0; i < n; i++) {
                    if(i==poll||check[i]) continue;
                    if((computers[poll][i]==1)||(computers[i][poll]==1)){
                        check[i]=true;
                        q.offer(i);

                    }
                }
            }
            answer++;
        }
        return answer;
    

       
    }
}