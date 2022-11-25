import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> arr=new ArrayList<>();
        int length = score.length;
        int[] answer = new int[length];
        arr.add(score[0]);
        answer[0]=arr.get(0);

        for (int i = 1; i <Math.min(k, length) ; i++) {
            arr.add(score[i]);
            Collections.sort(arr);
            answer[i]=arr.get(0);
        }
        for (int i = k; i < score.length; i++) {
            arr.add(score[i]);
            Collections.sort(arr);
            answer[i]=arr.get(arr.size()-k);
        }
        return answer;
    }
}