class Solution {
    public int[] solution(int[] num_list) {
      int length = num_list.length;
        int[] answer = new int[length];
        
        for (int n:num_list){
            length-=1;
            answer[length]=n;
        }
        return answer;
    }
}