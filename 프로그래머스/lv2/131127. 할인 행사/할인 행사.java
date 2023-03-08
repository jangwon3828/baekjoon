import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
      Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j <10 + i; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            boolean equal = equal(discountMap, map);
            if (equal) {
                answer +=1;

            }
        }
        return answer;
    }
      private boolean equal(Map<String, Integer> discountMap, Map<String, Integer> map) {
        Set<String> stringSet = discountMap.keySet();
        for (String s : stringSet) {
            if (discountMap.get(s)!=map.get(s)){
                return  false;
            }
        }
        return true;
    }
}