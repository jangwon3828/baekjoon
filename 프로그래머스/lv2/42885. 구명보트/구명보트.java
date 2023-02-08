import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
       Deque<Integer> dq = new ArrayDeque<>();
        Arrays.sort(people);
        for (int n : people) {
            dq.add(n);
        }
        int answer = 0;
        while (!dq.isEmpty()) {
            if (dq.getLast() + dq.getFirst() <= limit) {
                answer += 1;
                dq.pollFirst();
                dq.pollLast();
            }else {
                answer += 1;
                dq.pollLast();
            }
        }
        return answer;
    }
}