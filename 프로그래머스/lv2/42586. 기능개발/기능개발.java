import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        int[] answer=new int[length];
        for (int i = 0; i < length; i++) {
            answer[i]=100-progresses[i];
        }
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < 100; j++) {
                if(answer[i]-j*speeds[i]<=0){
                    answer[i]=j;
                    break;
                }
            }
        }
        Stack<Integer>stack=new Stack<>();
        ArrayList<Integer>arrayList=new ArrayList<>();
        int n=1;
        for (int i = 0; i < length; i++) {
            if(stack.isEmpty()){
                stack.push(answer[i]);
                continue;
            }
            Integer peek = stack.peek();
            if(answer[i]<=peek){
                n+=1;
            }else {
                stack.pop();
                stack.push(answer[i]);
                arrayList.add(n);
                n=1;
            }

        }
        arrayList.add(n);
         answer=new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i]=arrayList.get(i);
        }
        return answer;
    }
}