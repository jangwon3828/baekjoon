class Solution {
    public int solution(int a, int b, int n) {
        int change = n / a * b;
        int rest = change + n % a;
        int answer = change;
        while (rest >= a) {
            change = rest / a * b;
            rest = change + rest % a;
            answer += change;
        }
        return answer;
    }
}