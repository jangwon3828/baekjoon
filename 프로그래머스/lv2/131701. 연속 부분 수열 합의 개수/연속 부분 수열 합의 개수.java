import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> hs = new HashSet<>();

        int start = 1;
        while (start <= elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int value = 0;
                for (int j = i; j < i + start; j++) {
                    value += elements[j % elements.length];
                }
                hs.add(value);
            }
            start++;
        }
        return hs.size();
    }
}