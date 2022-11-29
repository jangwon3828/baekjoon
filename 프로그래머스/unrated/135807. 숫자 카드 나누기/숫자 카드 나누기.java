import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
       int answer = 0;
        int minA = Arrays.stream(arrayA).min().getAsInt();
        int minB = Arrays.stream(arrayB).min().getAsInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= minA; i++) {
            if (minA % i == 0) set.add(i);
        }
        for (int i = 2; i <= minB; i++) {
            if (minB % i == 0) set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        for (Integer integer : list) {
            boolean b = true;
            for (int j = 0; j < arrayA.length; j++) {
                if (arrayA[j] % integer != 0 || arrayB[j] % integer == 0) {
                    b = false;
                    break;
                }
            }
            if (b) answer = Math.max(answer, integer);
            b = true;
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayB[j] % integer != 0 || arrayA[j] % integer == 0) {
                    b = false;
                    break;
                }

            }
            if (b) answer = Math.max(answer, integer);

        }

        
        return answer;
        
    }
}