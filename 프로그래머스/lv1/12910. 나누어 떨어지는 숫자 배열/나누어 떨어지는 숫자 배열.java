import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> array=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                array.add(arr[i]);
            }
        }
        int[] answer =new int[array.size()];
        if(array.size()==0){
            int[] temp =new int[]{-1};
            answer=temp;
        }
        else{
            for (int i = 0; i < array.size(); i++) {
                answer[i]= array.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}