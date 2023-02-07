class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int y = 0, x = 0;

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                y = Math.min(i, yellow / i);
                x = Math.max(i, yellow / i);
                if ((y + 2) * (x + 2) == sum) {
                    break;
                }
            }
        }
        int[] answer = {x + 2, y + 2};
        return answer;
    }
}