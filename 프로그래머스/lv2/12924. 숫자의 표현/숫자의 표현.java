class Solution {
    public int solution(int n) {
        int answer=1;
        for (int i = 1; i < n; i++) {
            int temp=i;
            for (int j = i+1; j < n; j++) {
                if(temp+j==n)answer++;
                if(temp>n)break;
                temp+=j;
            }
        }
      
        return answer;
    }
}