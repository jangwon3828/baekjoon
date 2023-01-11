import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[] numbers, int target) {
         int answer=0;
        Queue<int[] >queue=new LinkedList<>();
        queue.offer(new int[]{numbers[0],0});
        queue.offer(new int[]{-numbers[0],0});
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            int val=poll[0];
            int index=poll[1];
            if(index==numbers.length-1){
                if(val==target)answer++;

                continue;
            }
            queue.offer(new int[]{val+numbers[index+1],index+1});
            queue.offer(new int[]{val-numbers[index+1],index+1});
        }
        return answer;
    }
}