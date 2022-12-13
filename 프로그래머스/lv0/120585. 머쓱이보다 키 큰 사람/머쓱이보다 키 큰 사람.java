import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int n:array){
            arr.add(n);
        }
        Collections.sort(arr);
        int answer=0;
        for(int n:array){
            if(n>height)
                answer++;
        }
        return answer;
    }
}