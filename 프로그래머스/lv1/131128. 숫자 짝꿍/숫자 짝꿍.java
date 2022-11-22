import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<Integer, Integer> XMap = new HashMap<>();
        Map<Integer, Integer> YMap = new HashMap<>();
        for (int i = 0; i < X.length(); i++) {
            int key = Integer.parseInt(String.valueOf(X.charAt(i)));
            if (XMap.get(key) == null) {
                XMap.put(key, 1);
                continue;
            }
            XMap.put(key, XMap.get(key) + 1);
        }


        for (int i = 0; i < Y.length(); i++) {
            int key = Integer.parseInt(String.valueOf(Y.charAt(i)));
            if (YMap.get(key) == null) {
                YMap.put(key, 1);
                continue;
            }
            YMap.put(key, YMap.get(key) + 1);
        }
        boolean xt = false;
        for (int i = 1; i < 10; i++) {
            if (XMap.get(i) != null&&YMap.get(i) != null) {
                xt = true;
                break;
            }
        }
        


        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            if (XMap.get(i) == null || YMap.get(i) == null) continue;
            int min = Math.min(XMap.get(i), YMap.get(i));
            if (i == 0 && !xt) {
                arr[i] = 1;
                continue;
            }
            arr[i] = min;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int i1 = arr[i];
            sb.append(String.valueOf(i).repeat(Math.max(0, i1)));
        }
        return sb.length()==0?"-1":sb.toString();
    }
}