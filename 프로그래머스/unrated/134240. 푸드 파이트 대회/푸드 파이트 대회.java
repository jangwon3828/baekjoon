class Solution {
    public String solution(int[] food) {
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }
        sb.append(0);
        for (int i = food.length-1 ;i > 0; i--) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }
        String answer = sb.toString();
        return answer;
    }
}