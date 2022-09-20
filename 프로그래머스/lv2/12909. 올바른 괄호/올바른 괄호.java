import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayList<Character> chars = new ArrayList<Character>();
        int u = 0;
        for (int i = 0; i < s.length(); i++) {
            try {
                char t = s.charAt(i);
                if (t == '(') {
                    chars.add(t);
                    u++;
                }
                if (t == ')') {
                    chars.remove(u - 1);
                    u--;
                }
            } catch (Exception e) {
                return false;
            }
        }
        if (chars.size() != 0)
            answer = false;
        return answer;
    }
}