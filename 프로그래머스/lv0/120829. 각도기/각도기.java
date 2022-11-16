class Solution {
    public int solution(int angle) {
        int answer = angle<90?1:angle==90?2:angle<180?3:4;
        return answer;
    }
}