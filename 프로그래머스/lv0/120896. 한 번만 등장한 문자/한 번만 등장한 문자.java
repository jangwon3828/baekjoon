import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String str : s.split("")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort(String::compareTo);
        for (String key : keyList) {
            if (map.get(key) == 1) {
                answer += key;
            }
        }
        
        return answer;
    }
}