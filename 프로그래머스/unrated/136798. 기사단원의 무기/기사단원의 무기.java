class Solution {
    public int solution(int number, int limit, int power) {
         int[] totalCount = new int[number];
        for(int i=1; i<=number; i++) {
            for(int j = i; j <=number; j+=i) {
                totalCount[j-1]++;
            }
        }
        int answer=0;
        for (int i : totalCount) {
            if(i<=limit){
                answer+=i;
                continue;
            }
            answer+=power;
        }
        return answer;
    }
}