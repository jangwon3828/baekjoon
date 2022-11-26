class Solution {
    public String solution(int[] numbers, String hand) {
       StringBuilder answer = new StringBuilder();
        int left = 10, right = 12;
        for (int num : numbers) {
            if (num == 0) num = 11;
            switch (num % 3) {
                case 0 -> { // R
                    answer.append("R");
                    right = num;
                }
                case 1 -> { // L
                    answer.append("L");
                    left = num;
                }
                case 2 -> { // L or R
                    int minusL = (num > left) ? num - left : left - num;
                    int minusR = (num > right) ? num - right : right - num;
                    int distanceL = (minusL % 3) + (minusL / 3);
                    int distanceR = (minusR % 3) + (minusR / 3);
                    if (distanceL < distanceR) {
                        answer.append("L");
                        left = num;
                    } else if (distanceR < distanceL) {
                        answer.append("R");
                        right = num;
                    } else {
                        answer.append(hand.equals("right") ? "R" : "L");
                        if (hand.equals("right")) right = num;
                        else left = num;
                    }
                }
            }
        }
        return answer.toString();
    }
}