import java.util.*;
class Solution {
    public int[] solution(String s) {
        String temp = s.substring(2);
        String temp2 = temp.substring(0, temp.length() - 2);
        String temp3 = temp2.replace('}', ' ');
        String temp4 = temp3.replace('{', ' ');
        String[] split = temp4.split(" , ");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(",");
            for (int j = 0; j < split1.length; j++) {
                int key = Integer.parseInt(split1[j]);
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            }
        }
        int[] ints = Arrays.stream(hashMap.values().toArray()).sorted().mapToInt(o -> Integer.parseInt(o.toString())).toArray();
        int[] answer = new int[ints.length];

        Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();
        int index = 0;

        for (int i = ints.length - 1; i >= 0; i--) {
            for (Map.Entry<Integer, Integer> entry : entrySet) {
                if (entry.getValue().equals(ints[i])) {
                    answer[index] = entry.getKey();
                    index += 1;
                }
            }

        }
        return answer;
    }
}