import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
      int answer=0;
        Map<Integer, Integer> map = new HashMap<>();
        for( int i : tangerine){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (int i = list.size() - 1; i >=0 ; i--) {
            answer++;
            k-=list.get(i);
            if(k<=0)break;
        }
        return answer;
    }
}